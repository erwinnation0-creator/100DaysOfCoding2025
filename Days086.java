package coding100days;
public class harike86 {
    public static void main(String[] args) {
        int [] angkaArray = {10,30,20,100,80,50};
        int min = angkaArray[0];
        for (int i = 0; i < angkaArray.length; i++) {
            if (angkaArray[i] < min) {
                min = angkaArray[i];
            }
        }
        System.out.println("Nilai minimal : " + min);
    }
}
