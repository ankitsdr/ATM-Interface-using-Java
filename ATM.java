import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initializeBank(); // Preload some accounts for testing

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        User user = bank.authenticateUser(userId, pin);
        if (user == null) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        System.out.println("Login successful. Welcome, " + user.getName() + "!");
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + user.getAccount().getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    user.getAccount().deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    user.getAccount().withdraw(withdrawAmount);
                    break;
                case 4:
                    user.getAccount().printMiniStatement();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
