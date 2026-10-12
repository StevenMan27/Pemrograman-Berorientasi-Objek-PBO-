/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */


// Mantra yang menyembunyikan rahasia di dalam jiwa seorang penyihir.
// Mantra ini butuh Secret Keeper, kalau belum ada maka aktivasi gagal.
public class Fidelius extends MantraPerlindungan {
    private final String rahasia;
    private Penyihir secretKeeper;

    // tanpa Secret Keeper, bisa ditentukan nanti lewat setSecretKeeper()
    public Fidelius(String rahasia) {
        super("Fidelius");
        this.rahasia = rahasia;
    }

    // langsung dengan Secret Keeper
    public Fidelius(String rahasia, Penyihir secretKeeper) {
        this(rahasia);
        this.secretKeeper = secretKeeper;
    }

    public void setSecretKeeper(Penyihir secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        if (isAktif()) {
            System.out.println("[Fidelius] Mantra sudah aktif.");
            return;
        }
        // Secret Keeper wajib ada
        if (secretKeeper == null) {
            System.out.println("Fidelius GAGAL diaktifkan: "
                    + "dibutuhkan penyihir sebagai Secret Keeper!");
            return;
        }
        System.out.println("Fidelius aktif! Rahasia \"" + rahasia
                + "\" kini tersembunyi dalam jiwa "
                + secretKeeper.getNama() + " (Secret Keeper).");
        setAktif(true);
    }

    @Override
    public void nonaktifkan() {
        if (!isAktif()) {
            System.out.println("[Fidelius] Mantra memang belum aktif.");
            return;
        }
        System.out.println("Fidelius dinonaktifkan. Rahasia \"" + rahasia
                + "\" tidak lagi terlindungi.");
        setAktif(false);
    }
}
