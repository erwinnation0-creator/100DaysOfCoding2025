public class Days085 {
    public static void main(String[] args) {

        int[] angka = {12, 5, 33, 7, 89, 21, 50};

        int max = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Angka maksimal adalah: " + max);
    }
}
