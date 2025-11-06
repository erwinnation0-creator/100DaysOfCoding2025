package Days060;

import java.util.Scanner;

public class Days060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Angka Ganjil dari N-1:");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka Genap dari N-1:");
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
