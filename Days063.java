package Days063;

import java.util.Scanner;

public class Days063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int N = input.nextInt();

        long hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= i;
        }

        System.out.println("Hasil perkalian 1 sampai " + N + " adalah: " + hasil);
    }
}
