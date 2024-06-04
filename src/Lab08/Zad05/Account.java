package Lab08.Zad05;

import javax.naming.InsufficientResourcesException;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public double withdraw(double amount) throws InsufficientResourcesException {
if (amount > balance) {
            throw new InsufficientResourcesException("Insufficient resources. Your current balance is " + balance);
        }
        balance-=amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
