package Days082;

import java.util.Scanner;

public class Days082 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("Masukkan 5 angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ": " + angka[i]);
        }
    }
}
