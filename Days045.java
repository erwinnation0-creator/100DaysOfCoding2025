package Days045;
import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int hari = input.nextInt();
        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Nomor hari tidak valid!";
        }

        System.out.println("Hari ke-" + hari + " adalah " + namaHari);
    }
}
