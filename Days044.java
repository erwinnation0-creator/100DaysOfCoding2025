package Days044;
import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        String predikat;

        System.out.println("=== Program Predikat Nilai ===");
        System.out.print("Masukkan nilai Anda: ");
        nilai = input.nextInt();

        if (nilai >= 85) {
            predikat = "A";
        } else if (nilai >= 75) {
            predikat = "B";
        } else if (nilai >= 65) {
            predikat = "C";
        } else if (nilai >= 50) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        System.out.println("Predikat Anda adalah: " + predikat);
    }
}
