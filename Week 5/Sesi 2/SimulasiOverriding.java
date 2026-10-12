/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LenovoLegion
 */

/*
SOAL :  Kalau @Override dihapus lalu nama method salah ketik (kirimbarang), apa output k2?
JAWAB:  Outputnya berubah jadi "lewat jalur darat menembus kemacetan".
        Soalnya method yang salah ketik dianggap method baru, bukan hasil override.
        Jadi waktu k2.kirimBarang() dipanggil, yang jalan tetap method milik parent.

SOAL :  Kalau @Override dikembalikan padahal nama method masih salah ketik, apa errornya?
JAWAB:  Compiler langsung protes dengan pesan:
        "method does not override or implement a method from a supertype".

SOAL :  Apa fungsi @Override buat programmer?
JAWAB:  Anggap saja @Override itu pengecek otomatis. Kita bilang ke compiler,
        "method ini harusnya menimpa method milik parent". Kalau ternyata tidak ada
        yang cocok (misalnya gara-gara typo atau parameternya beda), compiler
        langsung kasih error. Jadi kesalahan ketahuan lebih awal, tidak diam-diam
        jadi bug. Selain itu, kodenya juga jadi lebih jelas dibaca orang lain.
 */

// Runtime Polymorphism: Method Overriding
class KurirReguler {
    protected String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method parent: jalur darat
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat
                + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // @Override: validasi compiler + cegah salah ketik
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01"); // upcasting

        // JVM pilih method berdasarkan objek asli (runtime)
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}