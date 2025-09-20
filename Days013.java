package days013.java;
import java.util.Scanner;

public class Days013Java {
    

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     System.out.println("===== WELCOME TO EVALUASI MUHAMMAD ERWIN =====");
     
     String Nama_Lengkap,Nim,Hobi;
     int Usia;
     float Tinggi_Badan;
     boolean Status_Mahasiswa;
      System.out.print("Masukkan Nama Anda : ");
       Nama_Lengkap = in.nextLine();
         System.out.print("Masukkan Nim : ");
           Nim = in.nextLine();
            System.out.print("Masukkan Hobi : " );
              Hobi = in.nextLine();
                System.out.print("Masukkan Usia : " );
                 Usia = in.nextInt();
                   System.out.print("Masukkan Tinggi_Badan : ");
                     Tinggi_Badan = in.nextFloat();
                       System.out.print("Masukkan Status apakah anda Mahasiswa ? : ");
                       Status_Mahasiswa = in.nextBoolean();
                       
     int Tabungan = 1_000_000;
      System.out.println("Tabungan Awal :" + Tabungan);
         Tabungan += 500_000;
         Tabungan -= 200_000;
          System.out.println("Jumlah Tabungan Sekarang = " + Tabungan);
          
     final double PHI = 3.1415;
      System.out.println("Jari Jari : " + PHI);
     Double L;
     Double R;
      System.out.print("Masukkan Jari Jari Lingkaran : ");
      R = in.nextDouble();
      L= PHI * R * R;
       System.out.print("Luas Lingkaran : " + L);
       
        System.out.println("======Biodata Mahasiswa======");
        
         System.out.println("Nama Lengkap : " + Nama_Lengkap);
          System.out.println("Nim : " + Nim);
           System.out.println("Usia : " + Usia + " Tahun");
            System.out.println("Tinggi : " + Tinggi_Badan + " Cm");
             System.out.println("Hobi : " + Hobi);
              System.out.println("Apakah Anda Mahasiswa ? : " + Status_Mahasiswa);
               System.out.println("Tabungan : Rp. " + Tabungan);
                System.out.println("Luas Lingkaran : " + L);
      
       
      
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        
        
        
       
    }
    
}
