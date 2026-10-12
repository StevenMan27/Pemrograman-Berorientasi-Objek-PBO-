/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstrak;

/**
 *
 * @author LenovoLegion
 */

import java.util.ArrayList;
import java.util.List;

// Bagian 2.1 Abstract Class
// MantraAbstrak tidak bisa dibuat objeknya langsung. Subclass wajib
// mengisi method efek(), sedangkan method ucapkan() dipakai bersama.

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // method abstrak, tidak punya isi, harus diimplementasikan subclass
    public abstract void efek();

    // method biasa yang langsung diwarisi semua subclass
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");   // kirim nama ke constructor induk
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Mantra baru sesuai instruksi
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat sihir.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        System.out.println("Contoh dari modul:");
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        System.out.println();
        System.out.println("Mantra baru Lumos:");
        MantraAbstrak mantra3 = new Lumos();
        mantra3.ucapkan();
        mantra3.efek();

        System.out.println();
        System.out.println("Semua mantra dalam satu list:");
        List<MantraAbstrak> daftar = new ArrayList<>();
        daftar.add(mantra1);
        daftar.add(mantra2);
        daftar.add(mantra3);
        for (MantraAbstrak m : daftar) {
            m.ucapkan();
            m.efek();
        }

        // Untuk pertanyaan 1: kalau baris di bawah ini diaktifkan, compile error
        // "MantraAbstrak is abstract; cannot be instantiated" karena class abstrak
        // belum lengkap (efek() belum ada isinya) sehingga objeknya tidak boleh dibuat.
        // MantraAbstrak error = new MantraAbstrak("Coba");
    }
}
