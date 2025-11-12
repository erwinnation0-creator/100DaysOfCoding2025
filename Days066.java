package Days066;
import java.util.Scanner;

public class Days066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        System.out.println("\nPola 1: Kolom bintang (vertikal)");
        for (int i = 0; i < n; i++)
            System.out.println("*");

        System.out.println("\nPola 2: Kolom angka 1..N (vertikal)");
        for (int i = 1; i <= n; i++)
            System.out.println(i);

        System.out.println("\nPola 3: Segitiga vertikal (baris ke-i punya i bintang)");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\nPola 4: Kolom bergeser (setiap baris 1 bintang, tapi maju ke kanan)");
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++)
                System.out.print(" ");
            System.out.println("*");
        }

        sc.close();
    }
}
