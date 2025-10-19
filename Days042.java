package Days042;
import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan, potongan, gajiBersih;

        System.out.println("=== Program Hitung Gaji Bersih ===");
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        tunjangan = input.nextDouble();

        System.out.print("Masukkan potongan: ");
        potongan = input.nextDouble();

        gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("-------------------------------");
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Potongan    : " + potongan);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}
