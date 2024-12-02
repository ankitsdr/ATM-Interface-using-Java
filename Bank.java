import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, User> users;

    public Bank() {
        users = new HashMap<>();
    }

    public void initializeBank() {
        Account account1 = new Account("ACC123");
        User user1 = new User("John Doe", "user1", "1234", account1);
        users.put("user1", user1);

        Account account2 = new Account("ACC456");
        User user2 = new User("Jane Doe", "user2", "5678", account2);
        users.put("user2", user2);
    }

    public User authenticateUser(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.getPin().equals(pin)) {
            return user;
        }
        return null;
    }
}
