package Days074;

import java.util.Scanner;

public class Days074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Tampilkan Angka 1-5");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo!! Apa kabar?");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                    break;
                case 0:
                    System.out.println("Program selesai...");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }

            System.out.println(); // spasi biar rapi

        } while (pilihan != 0);
    }
}
