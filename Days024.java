package Days024;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r;
        double luas;
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextDouble();
        
        luas = 3.14 * r * r;
        
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}

