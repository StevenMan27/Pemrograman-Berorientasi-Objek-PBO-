/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LenovoLegion
 */

/*
SOAL :  Kenapa compiler sudah tahu method hitungOngkir mana yang dipakai sebelum program jalan?
JAWAB:  Karena compiler cuma lihat "tanda pengenal" method-nya, yaitu nama method
        ditambah isi kurungnya (jumlah, jenis, dan urutan parameter). Dari situ compiler
        langsung bisa cocokkan pemanggilan dengan method yang pas, jadi sudah
        ketahuan sejak proses compile, bukan nunggu program dijalankan.

SOAL :  Kenapa method int hitungOngkir(double) ditolak compiler?
JAWAB:  Karena nama dan parameternya sama persis dengan hitungOngkir(double) yang sudah ada.
        Yang beda cuma return type-nya, dan itu tidak dihitung sebagai pembeda.
        Compiler jadi bingung mau pilih yang mana, akhirnya muncul error:
        "method hitungOngkir(double) is already defined in class MesinTarif".
 */

// Compile-Time Polymorphism:
class MesinTarif {
    private String kotaAsal;
    
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
    
    // Overload 1: berat
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }
    
    // Overload 2: berat + asuransi
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }
    
    // Overload 3: berat + express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg + 10000;
        if (isExpress) total += 20000;
        return total;
    }
}

public class SimulasiOverloading {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERLOADING ===");
        MesinTarif tarif = new MesinTarif("Medan");
        
        // Compiler pilih method sesuai dengan parameter
        System.out.println("Ongkir Biasa(2.0Kg)            : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 50Jt): Rp " + tarif.hitungOngkir(2.0, 50000000));
        System.out.println("Ongkir Express (2,0Kg)         : " + tarif.hitungOngkir(2.0, true));
    }
}
