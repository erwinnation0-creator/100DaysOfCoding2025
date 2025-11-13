package Days067;
import java.util.Scanner;
public class Days067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        // Pola horizontal bintang
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Pola horizontal angka 1 sampai N
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
