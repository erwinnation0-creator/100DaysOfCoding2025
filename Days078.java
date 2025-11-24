package coding100days;
public class harike78 {
    public static void main(String[] args) {
         String kata = "   Anjayy suranjayyy   ";
         String kata2 = "anjayy";
         System.out.println(
            "HASIL PENGECEKAN STRING\n" +
            "=========================\n" +
            "equals()                : " + kata.equals(kata2) +
            "\nequalsIgnoreCase()      : " + kata.equalsIgnoreCase(kata2) +
            "\ncontains()              : " + kata.contains(kata2) +
            "\nisEmpty()               : " + kata.isEmpty() +
            "\nlength()                : " + kata.length() +
            "\nupper()                 : " + kata.toUpperCase() +
            "\nlower()                 : " + kata.toLowerCase() +
            "\ntrim()                  : " + kata.trim() +
            "\nreplace()               : " + kata.replace("suranjayyy", "Slebeww") +
            "\nsubstring(3)            : " + kata.substring(3)
        );
    }
}
