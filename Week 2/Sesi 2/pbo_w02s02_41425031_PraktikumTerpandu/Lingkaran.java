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

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        
        if (r < 0 ){
            System.out.println("Error: jari-jari tidak boleh negatif.");
        }
        else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

/*
1. Karena bangun datar tidak terdapat bilangan negatif, program akan gagal tanpa validasi tersebut. 
2. Setelah pengguna melakukan penginputan.
*/