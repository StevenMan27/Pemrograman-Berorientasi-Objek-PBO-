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

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung Spasi? " + nama.contains(" "));
    }
}

/*
1. Maka, program akan menganggap spasi sebagai karakter kosong.
*/