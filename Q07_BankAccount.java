class BankAccount {
    private double balance;

    BankAccount(double b) {
        if (b >= 0)
            balance = b;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else
            System.out.println("Invalid deposit amount.");
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Q07_BankAccount {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1000);
        a.deposit(500);
        a.deposit(-10);
        a.displayBalance();
    }
}
