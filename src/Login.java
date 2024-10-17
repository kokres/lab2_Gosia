import java.util.HashMap;

public class Login {
    private HashMap<String, String> users = new HashMap<>();

    public Login() {
        users.put("user1", "password123");
        users.put("admin", "adminpass");
        users.put("guest", "guest123");
    }

    public boolean authenticate(String username, String password) {
        try {
            if (users.containsKey(username)) {
                if (users.get(username).equals(password)) {
                    return true;
                } else {
                    System.out.println("Incorrect password.");
                    return false;
                }
            } else {
                System.out.println("Username not found.");
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Missing credentials. Please provide both username and password.");
            return false;
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return false;
        }
    }
}
