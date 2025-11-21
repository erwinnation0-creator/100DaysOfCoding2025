package Days075;

public class Days075 {
    public static void main(String[] args) {

        String teks = "Halo Dunia";

        // Menghitung panjang teks
        int panjang = teks.length();

        // Mengubah ke huruf besar
        String besar = teks.toUpperCase();

        // Mengubah ke huruf kecil
        String kecil = teks.toLowerCase();

        // Output
        System.out.println("Teks asli      : " + teks);
        System.out.println("Panjang teks   : " + panjang);
        System.out.println("Huruf besar    : " + besar);
        System.out.println("Huruf kecil    : " + kecil);
    }
}
