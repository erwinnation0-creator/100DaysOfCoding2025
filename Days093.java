package coding100days;
public class harike93 {
    public static void main(String[] args) {
         double angka = 7.7;
        
        double ceil = Math.ceil(angka);
        double floor = Math.floor(angka);
        double round = Math.round(angka);

        System.out.printf("angka awal : %.1f \nhasil ceil : %.1f \nhasil floor : %.1f \nhasil round : %.0f \n",angka,ceil,floor,round);
    }
}
