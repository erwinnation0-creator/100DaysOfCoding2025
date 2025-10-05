
package day28;
import java.util.Scanner;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b;
        System.out.print("Masukkan angka pertama: ");
        a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = in.nextInt();
        
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }
}
