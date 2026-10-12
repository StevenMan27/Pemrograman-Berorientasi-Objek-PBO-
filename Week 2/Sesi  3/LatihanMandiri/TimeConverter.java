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

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=-= Konverter Waktu =-=");
            System.out.println("1. Detik ke HH:MM:SS");
            System.out.println("2. HH:MM:SS ke detik");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah detik: ");
                    int totalDetikInput = scanner.nextInt();

                    int jam = totalDetikInput / 3600;
                    int sisaDetik = totalDetikInput % 3600;
                    int menit = sisaDetik / 60;
                    int detik = sisaDetik % 60;

                    // String.format dengan %02d memastikan format 2 digit (misal: 01:01:05)
                    System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);
                    break;

                case 2:
                    System.out.print("Masukkan waktu (HH:MM:SS): ");
                    String waktuInput = scanner.nextLine();

                    // Memisah string berdasarkan tanda titik dua ":"
                    String[] bagian = waktuInput.split(":");
                    
                    if (bagian.length == 3) {
                        int h = Integer.parseInt(bagian[0]);
                        int m = Integer.parseInt(bagian[1]);
                        int s = Integer.parseInt(bagian[2]);

                        int totalDetik = (h * 3600) + (m * 60) + s;
                        System.out.println("Hasil: " + totalDetik + " detik");
                    } else {
                        System.out.println("Format waktu salah! Gunakan format HH:MM:SS.");
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            System.out.println(); // Baris baru antar eksekusi
        } while (pilihan != 3);

        scanner.close();
    }
}

