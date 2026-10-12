/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class LoginSystem {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data akun yang benar
        String UsnBenar = "if425031";
        String PWBenar = "User031";
        
        int MaksPercobaan = 3;
        
        System.out.println("=== Sistem Login ===");
        
        // Looping maksimal 3 kali percobaan
        for (int P = 1; P <= MaksPercobaan; P++) {
            System.out.println("Percobaan " + P + ":");
            System.out.print("Username: ");
            String Usn = input.nextLine();
            System.out.print("Password: ");
            String PW = input.nextLine();
            
            // Cek apakah login berhasil
            if(Usn.equals(UsnBenar) && PW.equals(PWBenar)){
                System.out.print("Login Berhasil!");
                break; // Keluar dari loop jika berhasil
            }

            // Cek apakah ini percobaan terakhir
            if(P == MaksPercobaan){
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
                break;  // Menghentikan program
            }
            
            // Mengecek apakah ada angka di password
            boolean adaAngka = false;
            // Mengecek huruf satu persatu didalam password
            for (int i = 0; i < PW.length(); i++) {
                // Character.isDigit() itu bawaan Java untuk ngecek apakah sebuah huruf itu angka (0-9)
                if (Character.isDigit(PW.charAt(i))) {
                    adaAngka = true; // kalau ketemu angka, di ubah menjadi true
                    break;
                }
            }
            // Cek syarat password (kurang dair 8 atau tidak ada angka)
            if (PW.length() < 8 || adaAngka == false) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
            }
            
            // Cek syarat username
            else if (Usn.length() < 5 || Usn.length() > 10) {
                System.out.println("Login gagal! Username harus antara 5 hingga 15 karakter.");
            }
            
            // Jika username dan password tidak sesuai
            else {
                System.out.println("Login gagal! Username");
            }
        }
            
    }
}
