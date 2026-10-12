/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */


// Abstract class untuk semua mantra perlindungan Hogwarts.
// Menyimpan nama dan status aktif, dan mewajibkan subclass
// mengisi aktifkan() dan nonaktifkan() karena cara kerjanya beda-beda.
public abstract class MantraPerlindungan {
    private final String nama;
    private boolean aktif;

    public MantraPerlindungan(String nama) {
        this.nama = nama;
        this.aktif = false;   // awalnya belum aktif
    }

    public abstract void aktifkan();
    public abstract void nonaktifkan();

    public String getNama() {
        return nama;
    }

    public boolean isAktif() {
        return aktif;
    }

    // protected supaya status hanya diubah oleh subclass
    protected void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
