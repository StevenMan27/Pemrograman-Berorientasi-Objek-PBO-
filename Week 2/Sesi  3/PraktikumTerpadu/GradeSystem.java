/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumTerpadu;
import java.util.Scanner;

/*
Nama    : Christian Steven Manurung
NIM     : 41425031
Prodi   : Teknologi Rekayasa Perangkat Lunak
*/

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double total = 0;
        
        //input nilai
        for(int  i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }
        
        //hitung rata-rata
        double average = total / 5;
        System.out.println("Rata - rata nilai: " + average);
        
        //kategorikan nilai
        char grade;
        if(average >= 85) grade = 'A';
        else if(average >= 70) grade = 'B';
        else if(average >= 60) grade = 'C';
        else if(average >= 50) grade = 'D';
        else grade = 'E';
        
        System.out.println("Grade: " + grade);
        
        //tampilkan nilai tertinggi 
        double max = grades[0];
        double min = grades[0];
        
        for(int i = 0; i < 5; i++) {
            if(grades[i] > max) max = grades[i];
            if(grades[i] < min) min = grades[i];
        }
        
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
    
}
