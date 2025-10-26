package Wynn;
import java.util.Scanner;

public class Wynn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";
        System.out.println("Hasil: " + hasil);
    }
}
