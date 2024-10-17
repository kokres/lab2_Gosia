import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Login loginBackend = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz nazwe uzytkownika ");
        String username = scanner.nextLine();

        System.out.print("Wprowadz Haslo ");
        String password = scanner.nextLine();

        if (loginBackend.authenticate(username, password)) {
            System.out.println("Zalogowano ");
        } else {
            System.out.println("Logowanie nie powiodlo sie");
        }

        scanner.close();

        Register register = new Register();

        System.out.print("Podaj nazwę użytkownika: ");
        String username1 = scanner.nextLine();

        System.out.print("Podaj hasło: ");
        String password1 = scanner.nextLine();

        System.out.print("Podaj nie email: ");
        String email = scanner.nextLine();

        String result = register.registerUser(username1, password1, email);
        System.out.println(result);

    }
}