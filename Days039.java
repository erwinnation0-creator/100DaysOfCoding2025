package days039.java;
import java.util.Scanner;

public class Days039Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int Pesanan,Porsi;
           int Bakso,Mie_Ayam,Sate_Ayam,Nasi_Goreng; 
            System.out.println("======MENU MAKANAN BY WINN======"); 
             System.out.println("01.Bakso\n02.Mie Ayam\n03.Sate Ayam\n04.Nasi Goreng");
           
            System.out.print("Masukan nomor pada pesanan : ");
             Pesanan = input.nextInt();
              System.out.println("Masukan berapa porsi : ");
               Porsi = input.nextInt();
                System.out.println("====PESANAN====");
             
    
        if(Pesanan==01){
            System.out.println(" Bakso");
             Bakso = 10000;
              System.out.println("Harga Rp." + Bakso);
        } else if(Pesanan==02){
            System.out.println(" Mie Ayam");
             Mie_Ayam = 12000;
              System.out.println("Harga Rp." + Mie_Ayam);
        }   else if(Pesanan==03){
            System.out.println(" Sate Ayam");
             Sate_Ayam = 14000;
              System.out.println("Harga Rp." + Sate_Ayam);
        }else if(Pesanan==04){
            System.out.println("Nasi Goreng");
             Nasi_Goreng = 15000;
              System.out.println("Harga Rp." + Nasi_Goreng);
        }
            

            
    }
    
}
