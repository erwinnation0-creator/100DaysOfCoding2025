package Days035;
import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("TUGAS: ");
        double tugas = input.nextDouble();
        System.out.print("UTS: ");
        double uts = input.nextDouble();
        System.out.print("UAS: ");
        double uas = input.nextDouble();

        // Proses hitung nilai akhir
        double nilaiAkhir = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);

        // Tentukan kategori
        char kategori;
        if (nilaiAkhir >= 85) {
            kategori = 'A';
        } else if (nilaiAkhir >= 70) {
            kategori = 'B';
        } else if (nilaiAkhir >= 55) {
            kategori = 'C';
        } else {
            kategori = 'D';
        }

        // Output
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Kategori: " + kategori);
    }
}
