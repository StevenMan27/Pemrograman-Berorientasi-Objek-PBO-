/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challange;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class ValidatasiKartu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String nomorKartu = scanner.nextLine().trim();

        // Cek format penulisan kartu (hanya bisa forma 4 angka lalu tanda hubung)
        if (!nomorKartu.matches("^(\\d{16}|\\d{4}-\\d{4}-\\d{4}-\\d{4})$")) {
            System.out.println("Nomor kartu tidak valid!");
            
            // Cek tipe kesalahan
            String murniDigit = nomorKartu.replace("-", "");
            if (!murniDigit.matches("\\d+")) {
                System.out.println("Kartu kredit hanya boleh berisi angka dan tanda hubung.");
            } else if (murniDigit.length() != 16) {
                System.out.println("Harus 16 digit.");
            } else {
                System.out.println("Format tanda hubung harus tepat setiap 4 digit (XXXX-XXXX-XXXX-XXXX).");
            }
        } 
        // Cek digit pertama, harus dimulai dengan 4, 5, atau 6
        else if (!nomorKartu.startsWith("4") && !nomorKartu.startsWith("5") && !nomorKartu.startsWith("6")) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");
        } 
        // Jika semua benar
        else {
            System.out.println("Nomor kartu valid.");
        }

        scanner.close();
    }
}

