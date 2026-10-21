/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

/**
 *
 * @author LenovoLegion
 */
class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try {
            if (n == 0)
                a = a / (a - 1);
            else
                c[21] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic "
                    + "Exception here...");
        } catch (Exception e) {
            System.out.println("Let the other exception handler here...");
        }
    }
}

/*
KODE ASLI (yang aktif di atas):

} catch (ArithmeticException e) {
    System.out.println("Ups, seem out we have an Arithmetic "
            + "Exception here...");
} catch (Exception e) {
    System.out.println("Let the other exception handler here...");
}

KODE DIGANTI 5c (tidak bisa dikompilasi):

} catch (Exception e) {
    System.out.println("Ups, seem out we have an Arithmetic "
            + "Exception here...");
} catch (ArithmeticException e) {
    System.out.println("Let the other exception handler here...");
}
 */

/*
SOAL 5 - Multiple Catch

a.  Tanpa arguments (n bernilai 0):
    Catch yang dieksekusi adalah catch (ArithmeticException e).
    Output: Ups, seem out we have an Arithmetic Exception here...
    Alasannya a / (a - 1) menjadi 1 / 0 sehingga terjadi ArithmeticException.

b.  Dengan satu argument, misalnya: java soal5.MultipleCatch satu
    Catch yang dieksekusi adalah catch (Exception e).
    Output: Let the other exception handler here...
    Alasannya c[21] = 5 mengakses indeks di luar ukuran array (ukuran 1)
    sehingga terjadi ArrayIndexOutOfBoundsException. Exception ini tidak
    cocok dengan ArithmeticException, tetapi cocok dengan Exception
    (superclass-nya).

c.  Jika catch (Exception e) diletakkan sebelum catch (ArithmeticException e):
    Program gagal dikompilasi dengan pesan:
    error: exception ArithmeticException has already been caught
    Penjelasan: Java memeriksa catch dari atas ke bawah. Exception adalah
    superclass dari ArithmeticException, sehingga catch Exception sudah
    menangkap semua exception, termasuk ArithmeticException. Catch
    ArithmeticException di bawahnya tidak akan pernah tercapai (unreachable).
    Aturannya: catch untuk subclass harus ditulis lebih dulu, baru superclass.
*/
