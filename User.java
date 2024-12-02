public class User {
    private String name;
    private String userId;
    private String pin;
    private Account account;

    public User(String name, String userId, String pin, Account account) {
        this.name = name;
        this.userId = userId;
        this.pin = pin;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public Account getAccount() {
        return account;
    }
}
