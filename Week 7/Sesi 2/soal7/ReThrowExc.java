/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal7;

/**
 *
 * @author LenovoLegion
 */
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow "
                    + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\n "
                    + "thrown from demoThrow method");
        }
    }
}

/*
KODE ASLI (yang aktif di atas), bagian catch pada demoThrow:

} catch (NullPointerException e) {
    System.out.println("I'm catching the exception [" + e + "]");
    System.out.println("But I'll throw it again...\n");
    throw e;
}

KODE DIGANTI 7a (exception tidak dilempar ulang):

} catch (NullPointerException e) {
    System.out.println("I'm catching the exception [" + e + "]");
    System.out.println("But I'll throw it again...\n");
}
 */

/*
SOAL 7 - Re-throwing an Exception

Output kode asli:
    I'm throwing an exception from demoThrow method
    I'm catching the exception [java.lang.NullPointerException: demo]
    But I'll throw it again...

    I'm catching the exception [java.lang.NullPointerException: demo]
     thrown from demoThrow method

a.  Jika exception e tidak dilempar ulang (kode diganti 7a), exception sudah
    selesai ditangani di dalam demoThrow sehingga main tidak menerima
    exception apa pun. Catch di main tidak dijalankan dan output berhenti
    setelah "But I'll throw it again...". Jadi exception tidak akan
    ditangkap lagi di main.

b.  Kesimpulan:
    Exception yang sudah ditangkap bisa dilempar kembali dengan throw e agar
    ditangani juga oleh pemanggil method (main). Dengan begitu penanganan
    dapat dibagi bertingkat: method bawah melakukan penanganan awal
    (misalnya mencatat pesan), method atas menangani lanjutannya.
*/
