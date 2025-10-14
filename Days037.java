package days037.java;
import java.util.Scanner;


public class Days037Java {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Angka : ");
          int Angka = input.nextInt();
           
        if(Angka %2==0){  
            System.out.println("Bilangan Genap ");
            
        }else{
            System.out.println("Bilangan ganjil ");
        }
       
    }
    
}
