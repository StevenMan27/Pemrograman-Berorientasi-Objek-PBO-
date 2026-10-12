/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */


// Program utama tantangan: membuat beberapa mantra perlindungan,
// memasukkannya ke sistem pertahanan, lalu mengaktifkan dan menonaktifkannya.
public class DemoHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan("Pertahanan Hogwarts");

        // Fidelius sengaja dibuat tanpa Secret Keeper dulu untuk menguji kegagalan
        Protego protego = new Protego();
        Fidelius fidelius = new Fidelius("Lokasi Markas Orde Phoenix");
        MantraAntiApparition antiApparition = new MantraAntiApparition("Kastil Hogwarts");

        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Fidelius akan gagal karena belum ada Secret Keeper
        System.out.println();
        hogwarts.aktifkanSemuaMantra();
        hogwarts.tampilkanStatus();

        // tunjuk Secret Keeper lalu aktifkan lagi, mantra yang sudah aktif tidak diulang
        System.out.println();
        System.out.println("Albus Dumbledore ditunjuk sebagai Secret Keeper.");
        fidelius.setSecretKeeper(new Penyihir("Albus Dumbledore"));
        hogwarts.aktifkanSemuaMantra();
        hogwarts.tampilkanStatus();

        // uji efek Anti-Apparition saat aktif
        System.out.println();
        antiApparition.cobaApparition("Draco Malfoy");

        // matikan semua
        System.out.println();
        hogwarts.nonaktifkanSemuaMantra();
        hogwarts.tampilkanStatus();

        // uji lagi setelah dinonaktifkan
        System.out.println();
        antiApparition.cobaApparition("Draco Malfoy");
    }
}
