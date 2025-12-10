package coding100days;
import java.util.Scanner;
public class harike94 {
    public static void penjumlahan() {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        int hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void main(String[] args) {

      penjumlahan();
       
    }
}
