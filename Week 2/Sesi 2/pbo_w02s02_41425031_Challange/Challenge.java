/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02.pbo_w02s02_41425031_Challange;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = input.nextLine().toLowerCase().replace(" ", "");
        
        String reverse = new StringBuilder(kata).reverse().toString();
        System.out.println(kata.equals(reverse) ? kata + " adalah palindrome" : kata + " bukan palindrome");
        
        int vokal = 0;
        for (char c : kata.toCharArray()) {
            if ("aiueo".indexOf(c) != -1) {
                vokal++;
            }
        }
        System.out.println("Jumlah huruf vokal: " + vokal);
    }
}
