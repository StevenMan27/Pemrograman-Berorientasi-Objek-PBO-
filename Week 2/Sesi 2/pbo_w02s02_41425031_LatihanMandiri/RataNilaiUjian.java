/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02.pbo_w02s02_41425031_LatihanMandiri;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class RataNilaiUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai 2: ");
        int b = input.nextInt();
        System.out.println("Masukkan nilai 3: ");
        int c = input.nextInt();
        
        System.out.println("Rata-rata: " + (double)(a + b + c)/3);
    }
}