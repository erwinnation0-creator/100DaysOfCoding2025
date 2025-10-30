package Days053;
public class Days053 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);
            if (i == 5) {
                System.out.println("Perulangan dihentikan karena i = 5");
                break;
            }
        }
        System.out.println("Program selesai dijalankan.");
    }
}
