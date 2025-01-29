package ma.bouargalne;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private final List<Transaction> transactions = new ArrayList<>();
    private int balance = 0;

    @Override
    public void desposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount, balance));
    }

    @Override
    public void printStatement() {
        System.out.println("DATE | TYPE | AMOUNT | BALANCE");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
    public int getBalance() {
        return balance;
    }
}

