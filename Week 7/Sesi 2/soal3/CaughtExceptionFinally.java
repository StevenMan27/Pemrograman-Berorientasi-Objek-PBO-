/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author LenovoLegion
 */
class CaughtExceptionFinally {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if "
                        + "arguments is not zero");
            }
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

/*
SOAL 3 - Using Finally

a.  Dijalankan tanpa arguments (n bernilai 0):
    Catching exception: java.lang.ArithmeticException: / by zero
    After trying or catching...
    Pada 3/n terjadi ArithmeticException, sehingga baris setelahnya
    ("This won't be executed") dilewati, lalu catch dan finally dijalankan.

b.  Dijalankan dengan arguments, misalnya: java soal3.CaughtExceptionFinally satu
    This will be executed if arguments is not zero
    After trying or catching...
    Tidak ada exception, jadi blok else dijalankan, catch dilewati, dan
    finally tetap dijalankan.

c.  Kesimpulan:
    Blok finally selalu dieksekusi, baik ketika terjadi exception (a) maupun
    tidak (b). Karena itu finally cocok untuk kode pembersihan, misalnya
    menutup file atau koneksi.
*/
