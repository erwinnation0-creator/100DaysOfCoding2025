package days076;

public class Days076 {
    public static void main(String[] args) {
        
        String teks1 = "Halo Dunia";
        String teks2 = "halo dunia";
        String teks3 = "";
        String teks4 = "Saya sedang belajar Java";

        // 1. equals()
        System.out.println("1. equals()");
        System.out.println("teks1.equals(teks2) : " + teks1.equals(teks2));

        // 2. equalsIgnoreCase()
        System.out.println("\n2. equalsIgnoreCase()");
        System.out.println("teks1.equalsIgnoreCase(teks2) : " + teks1.equalsIgnoreCase(teks2));

        // 3. contains()
        System.out.println("\n3. contains()");
        System.out.println("teks4.contains(\"belajar\") : " + teks4.contains("belajar"));

        // 4. isEmpty()
        System.out.println("\n4. isEmpty()");
        System.out.println("teks3.isEmpty() : " + teks3.isEmpty());
    }
}
