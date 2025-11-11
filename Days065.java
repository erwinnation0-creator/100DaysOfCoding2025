package Days065;

public class Days065 {
    public static void main(String[] args) {
        int n = 5;
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }
}
