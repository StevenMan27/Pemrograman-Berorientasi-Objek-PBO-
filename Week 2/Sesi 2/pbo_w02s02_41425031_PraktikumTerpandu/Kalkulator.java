/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02.pbo_w02s02_41425031_PraktikumTerpandu;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + (double)a / b);
    }
    
}

/*
1. Nilai bertipe double membutuhkan memori lebih banyak dibandingkan int, dan juga double menyimpan angka desimal. Jika double di-cast menjadi int, bagian di belakang koma akan hilang.
2. Pembagian antara dua angka integer bisa menghasilkan angka desimal jika hasil bagi tidak berupa angka bulat.
3. Output yang dihasilkan akan berupa String yang berisi kata "infinity".
*/