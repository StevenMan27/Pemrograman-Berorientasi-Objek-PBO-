/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */


// Mantra yang mencegah apparition (teleportasi) di area tertentu
public class MantraAntiApparition extends MantraPerlindungan {
    private final String area;

    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        if (isAktif()) {
            System.out.println("[Anti-Apparition] Mantra sudah aktif.");
            return;
        }
        System.out.println("Mantra Anti-Apparition aktif: apparition dicegah di area "
                + area + ".");
        setAktif(true);
    }

    @Override
    public void nonaktifkan() {
        if (!isAktif()) {
            System.out.println("[Anti-Apparition] Mantra memang belum aktif.");
            return;
        }
        System.out.println("Mantra Anti-Apparition dinonaktifkan: apparition di area "
                + area + " diizinkan kembali.");
        setAktif(false);
    }

    // simulasi mencoba apparition, hasilnya tergantung status mantra
    public void cobaApparition(String namaPenyihir) {
        if (isAktif()) {
            System.out.println(namaPenyihir + " mencoba ber-apparition ke " + area
                    + " ... GAGAL! Area dilindungi.");
        } else {
            System.out.println(namaPenyihir + " mencoba ber-apparition ke " + area
                    + " ... BERHASIL.");
        }
    }
}
