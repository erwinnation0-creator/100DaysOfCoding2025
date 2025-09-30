package Days23;
import java.util.Scanner;


public class Days23 {

    
    public static void main(String[] args){ 
            Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Persegi Panjang : ");
         int Panjang = input.nextInt();
         
        System.out.print("Masukkan Lebar persegi \t\t : ");
         int Lebar = input.nextInt();
         int Luas = Panjang*Lebar;
         
        System.out.println("Jadi Luas Persegi Adalah " + Luas);
          
        
      
    }
    
}
