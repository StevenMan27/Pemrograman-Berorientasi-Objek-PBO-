/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal8;

/**
 *
 * @author LenovoLegion
 */
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

/*
KODE ASLI (dari modul, tidak bisa dikompilasi):

class ThrowsDemo {
    static void throwOne() {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccesException("demo");
    }

    public static void main(String args[]) {
        throwOne();
    }
}

KODE DIGANTI 8b (ArithmeticException, bisa dikompilasi dan dijalankan):

class ThrowsDemo {
    static void throwOne() {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new ArithmeticException("demo");
    }

    public static void main(String args[]) {
        throwOne();
    }
}

KODE PERBAIKAN (yang aktif di atas): IllegalAccessException, throws pada
throwOne, dan try-catch pada main.
 */

/*
SOAL 8 - Throws Demo

a.  Kode asli dari modul tidak bisa dikompilasi:
    error: cannot find symbol (class IllegalAccesException)
    Penyebab pertama adalah salah ketik, nama class yang benar adalah
    IllegalAccessException (dua huruf s pada Access).
    Setelah ditulis dengan benar pun tetap gagal dikompilasi:
    error: unreported exception IllegalAccessException; must be caught or
    declared to be thrown
    Penyebabnya IllegalAccessException adalah checked exception, sehingga
    wajib ditangani dengan try-catch atau dideklarasikan dengan throws.

b.  Jika IllegalAccessException diganti ArithmeticException (kode diganti 8b),
    kode berhasil dikompilasi tanpa throws maupun try-catch, lalu saat
    dijalankan:
    I'm throwing a non Runtime exception that I don't handle
    Without specifying in method declaration
    Exception in thread "main" java.lang.ArithmeticException: demo
        at ThrowsDemo.throwOne(ThrowsDemo.java)
        at ThrowsDemo.main(ThrowsDemo.java)
    Penyebabnya ArithmeticException adalah unchecked exception (turunan
    RuntimeException), sehingga tidak wajib ditangani atau dideklarasikan.
    Karena tidak ada yang menangkap, program berhenti dengan stack trace.

Output kode perbaikan:
    I'm throwing a non Runtime exception that I don't handle
    Without specifying in method declaration
    Caught java.lang.IllegalAccessException: demo
*/
