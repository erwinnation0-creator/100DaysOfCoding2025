package Days079;

import java.util.Scanner;

public class Days079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String username, password;
        String userLogin, passLogin;

        System.out.print("Buat username: ");
        username = in.nextLine();
        System.out.print("Buat password: ");
        password = in.nextLine();

        while (true) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("Username: ");
            userLogin = in.nextLine();
            System.out.print("Password: ");
            passLogin = in.nextLine();

            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Username atau password salah, coba lagi.");
            }
        }
    }
}
