/*Implement a Java program for a simple bank account management system. It should
have classes for Account, SavingsAccount, and CurrentAccount. Account should be an
abstract class with methods like deposit, withdraw, and getBalance. The SavingsAccount
and CurrentAccount classes should inherit from the Account class and override
necessary methods.*/

public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Additional methods specific to SavingsAccount
}

public class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }

    // Additional methods specific to CurrentAccount
}

// Usage example:
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
