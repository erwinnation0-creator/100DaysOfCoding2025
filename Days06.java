public class TipeDataPecahan {
    public static void main(String[] args) {
        // Tipe data float harus pakai huruf 'f' di akhir angkanya
        float nilaiFloat = 3.1415927f; // presisi sekitar 6-7 digit
        double nilaiDouble = 3.141592653589793; // presisi sekitar 15-16 digit

        // Menampilkan nilai
        System.out.println("Contoh tipe data float  : " + nilaiFloat);
        System.out.println("Contoh tipe data double : " + nilaiDouble);

        // Perbedaan saat menampilkan banyak angka di belakang koma
        float a = 1.0f / 3.0f;
        double b = 1.0 / 3.0;

        System.out.println("\nHasil pembagian 1/3:");
        System.out.println("Float  : " + a);
        System.out.println("Double : " + b);
    }
}

