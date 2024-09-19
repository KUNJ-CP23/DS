import java.util.Scanner;

class BankAccount {
    // Attributes
    int accountNumber;
    double balance;
    String accountHolderName;

    // Constructor to initialize bank account details
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of 3 BankAccount objects
        BankAccount[] accounts = new BankAccount[3];

        // Initialize bank accounts
        accounts[0] = new BankAccount(101, "kunj", 100000.0);
        accounts[1] = new BankAccount(102, "kunju", 150000.0);
        accounts[2] = new BankAccount(103, "kookie", 200000.0);

        // Bank operations
        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter account number: ");
                    int accNoDeposit = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.accountNumber == accNoDeposit) {
                            account.deposit(depositAmount);
                            break;
                        }
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter account number: ");
                    int accNoWithdraw = sc.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.accountNumber == accNoWithdraw) {
                            account.withdraw(withdrawAmount);
                            break;
                        }
                    }
                    break;

                case 3: // Check Balance
                    System.out.print("Enter account number: ");
                    int accNoCheck = sc.nextInt();
                    for (BankAccount account : accounts) {
                        if (account.accountNumber == accNoCheck) {
                            account.checkBalance();
                            break;
                        }
                    }
                    break;

                case 4: // Exit
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
