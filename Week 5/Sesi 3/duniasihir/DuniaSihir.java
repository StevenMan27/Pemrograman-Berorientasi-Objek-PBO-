/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package duniasihir;

/**
 *
 * @author LenovoLegion
 */


import java.util.ArrayList;
import java.util.List;

// Bagian 3.1 Gabungan Polymorphism dan Abstract Class
// Penyihir hanya mengenal tipe abstrak Mantra, jadi mantra baru bisa
// ditambah tanpa mengubah kelas Penyihir.

// Kerangka semua mantra
abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // setiap mantra konkret harus menentukan efeknya sendiri
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Mantra tambahan untuk membuktikan kelas Penyihir tidak perlu diubah
class Alohomora extends Mantra {
    public Alohomora() {
        super("Alohomora");
    }

    @Override
    public void efek() {
        System.out.println("Membuka kunci pintu!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;   // daftar mantra yang sudah dipelajari

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // bisa menerima mantra apa saja selama turunan Mantra
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // cari mantra berdasarkan nama lalu jalankan efeknya
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();   // efek yang jalan sesuai objek aslinya
                return;
            }
        }
        // sampai sini berarti mantra tidak ditemukan di daftar
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Tambahan dari instruksi: ucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        System.out.println(nama + " mengucapkan semua mantranya:");
        for (Mantra mantra : mantraList) {
            System.out.println("- " + nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        System.out.println("Contoh dari modul:");
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");   // belum dipelajari

        // ajari Lumos lalu coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        System.out.println();
        System.out.println("Mengucapkan semua mantra sekaligus:");
        harry.ucapkanSemuaMantra();

        System.out.println();
        System.out.println("Mantra baru Alohomora, kelas Penyihir tidak diubah:");
        Penyihir hermione = new Penyihir("Hermione Granger");
        hermione.ucapkanSemuaMantra();
        hermione.belajarMantra(new Alohomora());
        hermione.belajarMantra(new Lumos());
        hermione.ucapkanSemuaMantra();
    }
}
