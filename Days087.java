package coding100days;
import java.util.Scanner;
public class harike87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka [] = {10,50,100,80,30};
        System.out.print("Mencari angka : ");
        int cari = in.nextInt();
        
        boolean ditemukan = false;
        for (int a : angka) {
            if (a == cari) {
                ditemukan = true;
            }
        }
        if (ditemukan) {
                System.out.println("angka "+ cari + " ditemukan");    
        }else{
                System.out.println("angka "+ cari + " tidak ditemukan");    
            
        }
    }
}
