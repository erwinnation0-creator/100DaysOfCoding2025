package Days062;

import java.util.Scanner;

public class Days062 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int total = 0;

        for (int i = 1; i <= N; i++) {
            total += i;
        }

        System.out.println("Jumlah dari 1 sampai " + N + " adalah: " + total);
    }
}
