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

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan suhu dalam Celcius: ");
        double a = input.nextInt();
        double CtoF = (double)(a * 9 / 5  + 32);
        System.out.println(a + " C = " + CtoF + " F");
        System.out.println("Masukkan suhu dalam Fahrenheit: ");
        double b = input.nextInt();
        double FtoC = (double)(b - 32) * 5 / 9;
        System.out.println(b + " F = " + FtoC + " C");
    }
}
