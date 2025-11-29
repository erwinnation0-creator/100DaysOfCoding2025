package Days083;

public class Days083 {

    public static void main(String[] args) {

        int[] Wynn = {10, 20, 30, 40, 50, 60, 70};

        int total = 0;
        for (int i = 0; i < Wynn.length; i++) {
            total += Wynn[i];
        }
        System.out.println("Total : "+total);
    }
}
