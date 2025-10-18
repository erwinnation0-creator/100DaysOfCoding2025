import java.util.Scanner;

public class Day41_Mentor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teori, praktik;
        String predikat = "", keterangan = "";

        System.out.println("=== Program Evaluasi Mentor ===");
        System.out.print("Masukan nilai teori = ");
        teori = input.nextInt();
        System.out.print("Masukan nilai praktik = ");
        praktik = input.nextInt();

        if (teori < 0 || teori > 100 || praktik < 0 || praktik > 100) {
            System.out.println("Nilai tidak valid! Harus antara 0 - 100.");
            return;
        }

        if (teori >= 90 && praktik >= 90) {
            predikat = "A";
            keterangan = "Lulus dengan Predikat Sangat Baik";
        } else if (teori >= 80 && praktik >= 75) {
            predikat = "B";
            keterangan = "Lulus dengan Predikat Baik";
        } else if (teori >= 70 && praktik >= 60) {
            predikat = "C";
            keterangan = "Lulus dengan Predikat Cukup";
        } else {
            predikat = "D";
            keterangan = "Tidak Lulus";
        }

        System.out.println("\nNilai Teori   : " + teori);
        System.out.println("Nilai Praktik : " + praktik);
        System.out.println("Predikat      : " + predikat);
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("====================================");
    }
}
