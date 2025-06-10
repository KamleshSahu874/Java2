import java.util.*;

class Transaction {
    String type;
    double amount;
    Date timestamp;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }
    public String toString() {
        return timestamp + " - " + type + ": ₹" + amount;
    }
}
class Account {
    String name;
    long accountNumber;
    double balance;
    List<Transaction> transactionHistory;

    Account(String name, long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction t : transactionHistory) {
                System.out.println(t);
            }
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Welcome to the Bank!\nEnter your name to create an account: ");
        String name = sc.nextLine();
        long accNo = 100000 + rand.nextInt(900000); 
        Account account = new Account(name, accNo);

        System.out.println("Account created successfully!");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);

        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wdAmount = sc.nextDouble();
                    account.withdraw(wdAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
