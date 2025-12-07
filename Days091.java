package coding100days;
import java.util.Scanner;
public class harike91 {
    public static int luasPersegiPanjang(int panjang, int lebar) {
        int total = panjang * lebar;
        return total;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan Panjang : ");
        int panjang = in.nextInt();
        System.out.print("Masukan Lebar : ");
        int lebar = in.nextInt();
        System.out.println("Luas persegi panjang : "+ luasPersegiPanjang(panjang, lebar));
    }
}
