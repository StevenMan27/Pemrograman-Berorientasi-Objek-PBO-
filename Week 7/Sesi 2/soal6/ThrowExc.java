/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal6;

/**
 *
 * @author LenovoLegion
 */
class ThrowExc {
    public static void main(String args[]) {
        try {
            System.out.println("I'm throwing an exception from here...");
            throw new NullPointerException("throw demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching an exception: [" + e + "] "
                    + "from here...");
        }
    }
}

/*
SOAL 6 - Throwing an Exception

Output:
    I'm throwing an exception from here...
    I'm catching an exception: [java.lang.NullPointerException: throw demo] from here...

Pengamatan:
    Keyword throw dipakai untuk melempar exception secara manual. Di sini
    objek NullPointerException dibuat dengan pesan "throw demo" lalu
    dilempar. Eksekusi langsung pindah ke catch yang cocok, dan e berisi
    nama class serta pesan exception tersebut.
*/
