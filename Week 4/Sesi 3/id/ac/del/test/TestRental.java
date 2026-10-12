/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.id.ac.del.test;

import main.java.id.ac.del.rental.CorporateDiscount;
import main.java.id.ac.del.rental.Discountable;
import main.java.id.ac.del.rental.FlashSaleDiscount;
import main.java.id.ac.del.rental.MemberDiscount;
import main.java.id.ac.del.rental.VehicleRental;

/**
 *
 * @author LenovoLegion
 */

/*
    Nama  : Christian Steven Manurung
    NIM   : 41425031
    Tugas : Pemrograman Berbasis Objek
*/

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        // Data tidak valid sekarang ditolak oleh setter
        v.setPlateNumber("");     // ditolak: plat kosong
        v.setRentalDays(-7);      // ditolak: hari negatif

        // Data valid
        v.setRentalDays(7);

        // Tipe referensi adalah interface, objeknya bisa diganti-ganti (polimorfisme)
        Discountable member = new MemberDiscount();
        Discountable flash = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Tanpa diskon   : Rp" + v.getTotalCost(null));
        System.out.println("Member (10%)   : Rp" + v.getTotalCost(member));
        System.out.println("Flash Sale(25%): Rp" + v.getTotalCost(flash));
        System.out.println("Corporate (15%): Rp" + v.getTotalCost(corporate));
    }
}
/*
1) Analisis Kompilasi dan Hak Akses
Pada pengujian kompilasi, terdapat error pada Baris B dan Baris C.
- Baris A (plateNumber, public): Berhasil dikompilasi (lolos) karena modifier public memungkinkan atribut diakses dari package mana pun.
- Baris B (rentalRatePerDay, protected): Terjadi error. Modifier protected hanya mengizinkan akses dari package yang sama atau dari subclass. Class TestRental berada di package yang berbeda (id.ac.del.test) dan bukan merupakan subclass dari VehicleRental.
- Baris C (discountRate, tanpa modifier): Terjadi error. Jika tidak menggunakan modifier (default), atribut tersebut hanya bisa diakses dari dalam package yang sama (id.ac.del.rental).
- Baris D (setRentalDays, method public): Berhasil dikompilasi karena method ini bersifat public.
- Atribut rentalDays (private): Hanya bisa diakses dan diubah dari dalam class VehicleRental itu sendiri.

2) Kelemahan Integritas Data
- Method setRentalDays hanya menerima nilai masuk tanpa melakukan pengecekan, sehingga nilai yang tidak masuk akal seperti -7 atau 0 tetap bisa tersimpan. Walaupun atributnya private dan menggunakan setter, keamanan datanya sama saja dengan atribut public jika tidak ada validasi. Celah serupa juga ada pada Baris A, di mana atribut plateNumber bersifat public, sehingga string kosong ("") bisa langsung dimasukkan dari luar class.
- Kelemahan validasi ini membuat perhitungan total biaya bisa menjadi minus (negatif) jika lama sewa diisi dengan angka minus (contoh: 250.000 x -7 = -1.750.000). Selain itu, tarif per hari dan persentase diskon juga bisa diisi dengan nilai yang tidak wajar, seperti tarif minus atau diskon di atas 100%.
- Solusi perbaikan: Semua atribut harus diubah menjadi private dan ditambahkan method getter. Konstruktor dan method setter juga wajib diberi validasi (misalnya: plat nomor tidak boleh kosong, tarif harus lebih dari 0, dan lama sewa minimal 1 hari). Pada method getTotalCost, perhitungan potongan harga juga harus dibatasi agar tidak bernilai negatif dan tidak melebihi subtotal biaya sewa.

3) Penerapan Interface
- Interface Discountable memiliki satu method, yaitu double calculateDiscount(double amount). Interface ini kemudian diterapkan ke dalam tiga class berbeda: MemberDiscount (10%), FlashSaleDiscount (25%, maksimal Rp150.000), dan CorporateDiscount (15%).
- Method getTotalCost(Discountable discount) di class VehicleRental bertugas menghitung subtotal biaya sewa, lalu menggunakan objek diskon yang dikirim dari TestRental untuk menghitung potongan harganya. Dengan struktur ini, VehicleRental tidak perlu tahu secara spesifik jenis diskon apa yang sedang dipakai. Jika ke depannya ada jenis diskon baru, kita bisa langsung menambahkannya tanpa perlu mengubah kode pada class VehicleRental.
*/