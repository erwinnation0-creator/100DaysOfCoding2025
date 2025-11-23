package days077;

public class Days077 {
    public static void main(String[] args) {

        // Contoh teks dasar
        String teks = "   Hallo anak informatika Unsulbar   ";

        // 1. substring()
        // Mengambil sebagian teks
        String potongan = teks.substring(3, 20);

        // 2. replace()
        // Mengganti kata tertentu
        String diganti = teks.replace("Hallo", "Halo");

        // 3. trim()
        // Menghapus spasi di awal dan akhir
        String rapih = teks.trim();

        // Output
        System.out.println("Teks asli: [" + teks + "]");
        System.out.println("Hasil substring(3,20): [" + potongan + "]");
        System.out.println("Hasil replace(): [" + diganti + "]");
        System.out.println("Hasil trim(): [" + rapih + "]");
    }
}
