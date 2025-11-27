package Wynn;
import java.util.Scanner;
public class Wynn {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        int[] nilai = {70, 80, 90, 75, 85}; 
      
        System.out.print("Masukkan indeks : ");
        int i = in.nextInt();
      
        System.out.println("\nNilai pada indeks " + i + " = " + nilai[i]);
    }
}
