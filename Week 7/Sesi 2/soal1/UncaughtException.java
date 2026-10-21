/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LenovoLegion
 */
class UncaughtException {
    public static void main(String args[]) {
        System.out.println(3/0);
    }
}

/*
SOAL 1 - Uncaught Exception

a.  Analisis:
    Ekspresi 3/0 adalah pembagian bilangan bulat (int) dengan nol. Kode ini
    lolos saat kompilasi, tetapi ketika dijalankan JVM melempar
    ArithmeticException. Exception tersebut tidak ditangkap oleh try-catch
    mana pun, sehingga diteruskan ke JVM (default handler). Akibatnya program
    berhenti secara tidak normal dan System.out.println tidak sempat
    mencetak apa pun.

b.  Output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at soal1.UncaughtException.main(UncaughtException.java:13)
*/
