/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package overriding;

/**
 *
 * @author LenovoLegion
 */



// Bagian 1.2 Method Overriding
// Subclass menulis ulang method ucapkanMantra() milik Penyihir.
// Method yang dijalankan ditentukan saat program berjalan, sesuai objek aslinya.

// Kelas induk dengan perilaku umum
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Di modul tertulis Hermonie, di sini dipakai ejaan Hermione
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Kelas baru sesuai instruksi: Ron mengucapkan mantra dengan gugup
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan gugup, "
                + "tongkatnya bergetar, tetapi tetap berani mencoba.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        System.out.println("Contoh dari modul:");
        // variabelnya bertipe Penyihir, tetapi objeknya subclass
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();

        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();

        System.out.println();
        System.out.println("Semua penyihir dalam satu array:");
        Penyihir[] semuaPenyihir = {
            new Penyihir(),
            new HarryPotter(),
            new Hermione(),
            new RonWeasley()
        };

        // method yang dipanggil sama, hasilnya beda untuk tiap objek
        for (Penyihir p : semuaPenyihir) {
            p.ucapkanMantra();
        }
    }
}
