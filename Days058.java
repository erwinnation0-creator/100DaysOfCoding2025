package Days058;
import java.util.Scanner;

public class Days058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        System.out.println("\nAngka dari 1 ke " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nAngka dari " + N + " ke 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
