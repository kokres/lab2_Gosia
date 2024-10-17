import java.util.ArrayList;
import java.util.regex.Pattern;

public class Register {

    private ArrayList<User> users = new ArrayList<>();

    public static class User {
        private String username;
        private String password;
        private String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

    }

    public String registerUser(String username, String password, String email) {
        if (!isValidEmail(email)) {
            return "Nieprawidłowy format adresu email.";
        }

        if (isUsernameTaken(username)) {
            return "Nazwa użytkownika jest już zajęta.";
        }

        User newUser = new User(username, password, email);
        users.add(newUser);

        return "Rejestracja zakończona sukcesem!";
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //komentarz
    //komentarz 2
    //komentarz 3
}
