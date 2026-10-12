/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LenovoLegion
 */

/*
SOAL EKSPERIMEN 2: Buat class MotorKurir extends KendaraanEkspedisi tanpa method
angkutBarang(). Arahkan kursor ke garis merah error, lalu tulis dua opsi solusi dari IDE.

JAWAB:
  Pesan error: "MotorKurir is not abstract and does not override abstract method angkutBarang(String) in KendaraanEkspedisi"
  Dua opsi solusi dari IDE:
    1) Implement all abstract methods -> IDE otomatis membuatkan kerangka
       method angkutBarang() di dalam MotorKurir.
    2) Make MotorKurir abstract -> class MotorKurir dijadikan abstract,
       jadi tidak wajib mengisi method tersebut (tapi juga tidak bisa di-new).

CATATAN: File ini sengaja dibuat error untuk keperluan analisis.
 */

class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // angkutBarang() sengaja belum ditulis → memicu error di atas
}