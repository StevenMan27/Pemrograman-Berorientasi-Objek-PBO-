/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

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
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

/*
KODE ASLI (dari soal 3):

} catch (Exception e) {
    System.out.println("Catching exception: " + e);
}

KODE DIGANTI (yang aktif di atas):

} catch (NullPointerException e) {
    System.out.println("Catching exception: " + e);
}
 */

/*
SOAL 4 - Modifikasi soal 3 (catch Exception diganti NullPointerException)

Tanpa arguments:
    After trying or catching...
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at soal4.CaughtExceptionFinally.main(CaughtExceptionFinally.java:16)
    Exception yang terjadi adalah ArithmeticException, sedangkan catch hanya
    menangani NullPointerException, sehingga tidak ada catch yang cocok.
    Blok finally tetap dijalankan (tercetak lebih dulu), lalu exception
    diteruskan ke JVM dan program berhenti secara tidak normal.

Dengan arguments:
    This will be executed if arguments is not zero
    After trying or catching...
    Tidak ada exception, program berjalan normal.

Penjelasan jika exception tidak memiliki catch yang cocok:
    Exception tidak tertangani di method tersebut, lalu dilempar ke pemanggil
    (di sini JVM). Sebelum itu, blok finally tetap dijalankan. Program
    akhirnya berhenti dan stack trace dicetak.
*/
