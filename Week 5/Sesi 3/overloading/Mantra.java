/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package overloading;

/**
 *
 * @author LenovoLegion
 */


// Bagian 1.1 Method Overloading
// Kelas Mantra punya beberapa method bernama ucapkan() dengan parameter berbeda.
// Java memilih method yang dipanggil saat compile berdasarkan argumen yang dikirim.
public class Mantra {

    // Overload 1: hanya nama mantra
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload 2: nama mantra dan kekuatan
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan);
        // efek ditentukan dari besar kekuatan
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload 3: nama mantra, kekuatan, dan target
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Overload 4 (tambahan dari instruksi): nama mantra dan target, tanpa kekuatan.
    // Karena tidak ada kekuatan, efek yang dipakai adalah efek biasa.
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: Senjata " + target + " terlepas.");
    }

    // Overload 5 (untuk pertanyaan 2): urutan parameter dibalik, int dulu baru String.
    // Ini boleh karena tipe parameternya berbeda urutan dari overload 2.
    // Isinya cukup memanggil overload 2 supaya tidak menulis kode yang sama dua kali.
    public void ucapkan(int kekuatan, String namaMantra) {
        ucapkan(namaMantra, kekuatan);
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        System.out.println("Contoh dari modul:");
        mantra.ucapkan("Expelliarmus");                    // overload 1
        mantra.ucapkan("Expelliarmus", 5);                 // overload 2
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");   // overload 3

        System.out.println();
        System.out.println("Overload nama mantra dan target:");
        mantra.ucapkan("Expelliarmus", "Voldemort");       // overload 4

        System.out.println();
        System.out.println("Overload dengan urutan parameter terbalik:");
        mantra.ucapkan(20, "Expelliarmus");                // overload 5
    }
}
