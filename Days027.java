package Days027.java
import java.util.Scanner;

public class NamaDanUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Halo, nama saya " + nama + ".");
        System.out.print("Umur saya " + umur + " tahun.");
        System.out.printf("\nDalam 5 tahun lagi umur saya adalah %d tahun.", umur + 5);
    }
}
