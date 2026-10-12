/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tantangan;

/**
 *
 * @author LenovoLegion
 */

// Mantra perisai pelindung
public class Protego extends MantraPerlindungan {

    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        // jangan aktifkan dua kali
        if (isAktif()) {
            System.out.println("[Protego] Perisai sudah aktif.");
            return;
        }
        System.out.println("Perisai Protego terbentuk!");
        setAktif(true);
    }

    @Override
    public void nonaktifkan() {
        if (!isAktif()) {
            System.out.println("[Protego] Perisai memang belum aktif.");
            return;
        }
        System.out.println("Perisai Protego menghilang.");
        setAktif(false);
    }
}
