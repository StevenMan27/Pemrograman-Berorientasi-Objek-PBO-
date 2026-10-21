/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author LenovoLegion
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException ex) {
            System.out.println("Error " + ex);
        }
    }
}

/*
KODE ASLI (yang aktif di atas):

} catch (ArithmeticException ex) {
    System.out.println("Error " + ex);
}

KODE DIGANTI 2a (1): ex diganti ex.getMessage()

} catch (ArithmeticException ex) {
    System.out.println("Error " + ex.getMessage());
}

KODE DIGANTI 2a (2): ex diganti ex.getStackTrace()

} catch (ArithmeticException ex) {
    System.out.println("Error " + ex.getStackTrace());
}

KODE DIGANTI 2a (3): ditambah statement ex.printStackTrace()

} catch (ArithmeticException ex) {
    System.out.println("Error " + ex);
    ex.printStackTrace();
}

KODE DIGANTI 2b: ArithmeticException diganti Exception

} catch (Exception ex) {
    System.out.println("Error " + ex);
}
 */

/*
SOAL 2 - Handling the Exception

Hasil kode asli:
    Error java.lang.ArithmeticException: / by zero

a.  Hasil pengamatan setelah mengganti ex:
    - ex.getMessage()
      Output: Error / by zero
      Hanya mengembalikan pesan singkat exception, tanpa nama class-nya.
    - ex.getStackTrace()
      Output: Error [Ljava.lang.StackTraceElement;@xxxxxxxx (kode hash
      berbeda tiap eksekusi). Method ini mengembalikan array
      StackTraceElement, bukan String, sehingga yang tercetak adalah
      representasi objek array, bukan isi jejaknya.
    - ex.printStackTrace()
      Output (ke stderr):
        java.lang.ArithmeticException: / by zero
            at soal2.HandlingException.main(HandlingException.java:14)
      Mencetak jenis exception, pesan, dan urutan pemanggilan method beserta
      nomor baris tempat exception terjadi.

b.  Mengganti ArithmeticException dengan Exception:
    Hasilnya sama, yaitu: Error java.lang.ArithmeticException: / by zero
    Penjelasan: Exception adalah superclass dari ArithmeticException,
    sehingga catch (Exception ex) juga dapat menangkap ArithmeticException
    (polimorfisme). Objek yang ditangkap tetap bertipe ArithmeticException,
    maka yang tercetak masih nama class aslinya.
*/
