package Days019;
public class KonversiManual {
    public static void main(String[] args) {
        // tipe data besar (double)
        double angkaBesar = 99.99;

        // konversi manual/paksa ke tipe data lebih kecil (int)
        int angkaKecil = (int) angkaBesar; // pakai (int) untuk casting

        System.out.println("Nilai double : " + angkaBesar);
        System.out.println("Setelah konversi manual ke int : " + angkaKecil);
    }
}
