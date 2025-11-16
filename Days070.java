package Days070;

import java.util.Scanner;

public class Days070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar;

        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt();

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
