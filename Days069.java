
package days069.java;
import java.util.Scanner;

public class Days069Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Kembali Ke Masa Lalu===");
         String user,pass;
          int Kesempatan = 3;
           
        for (int i=1;i <= Kesempatan; i++) {
            System.out.print("Masukan User Name : ");
             user = input.nextLine();
            
            System.out.print("Masukan Password  : ");
             pass = input.nextLine();
             
            if(user.equals("Wynn") && pass.equals("From u 2000 Years Ago!")){
                System.out.println("Login Berhasil! Selamat Datang!");
                return;
            } else{
                System.out.println("Login Gagal! Coba Lagi.");
         
            }
                }
            System.out.println("Akses Ditolak !");
        } 
}
        
    
    

