/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */


import java.util.ArrayList;
import java.util.List;

// Menampung banyak mantra perlindungan dan mengelolanya sekaligus.
// Kelas ini hanya mengenal tipe abstrak MantraPerlindungan, jadi mantra
// baru bisa ditambah tanpa mengubah kelas ini.
public class SistemPertahanan {
    private final String nama;
    private final List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    public SistemPertahanan(String nama) {
        this.nama = nama;
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        if (mantra == null) {
            System.out.println("Mantra tidak boleh null.");
            return;
        }
        daftarMantra.add(mantra);
        System.out.println(mantra.getNama() + " ditambahkan ke " + nama + ".");
    }

    // setiap mantra menjalankan aktifkan() versinya sendiri
    public void aktifkanSemuaMantra() {
        System.out.println("Mengaktifkan semua mantra di " + nama + ":");
        for (MantraPerlindungan m : daftarMantra) {
            m.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("Menonaktifkan semua mantra di " + nama + ":");
        for (MantraPerlindungan m : daftarMantra) {
            m.nonaktifkan();
        }
    }

    // tambahan supaya status semua mantra mudah dicek
    public void tampilkanStatus() {
        System.out.println("Status " + nama + ":");
        for (MantraPerlindungan m : daftarMantra) {
            System.out.println(m.getNama() + " : "
                    + (m.isAktif() ? "AKTIF" : "tidak aktif"));
        }
    }
}
