import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Login loginBackend = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (loginBackend.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();

        Register register = new Register();

        System.out.print("Podaj nazwę użytkownika: ");
        String username1 = scanner.nextLine();

        System.out.print("Podaj hasło: ");
        String password1 = scanner.nextLine();

        System.out.print("Podaj adres email: ");
        String email = scanner.nextLine();

        String result = register.registerUser(username1, password1, email);
        System.out.println(result);

    }
}