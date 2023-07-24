package corejavaassignm.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(10000, 5000));
        accounts.add(new CurrentAccount(20000, 10000));
        accounts.add(new SavingsAccount(10000, 5000));

        double totalCash = 0;
        for (Account account : accounts) {
            totalCash += account.getBalance();
        }

        System.out.println("Total cash in the bank: " + totalCash);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double fixedDeposits;

    public SavingsAccount(double balance, double fixedDeposits) {
        super(balance);
        this.fixedDeposits = fixedDeposits;
    }

    @Override
    public double getBalance() {
        return super.getBalance() + fixedDeposits;
    }
}

class CurrentAccount extends Account {
    private double cashCredit;

    public CurrentAccount(double balance, double cashCredit) {
        super(balance);
        this.cashCredit = cashCredit;
    }

    @Override
    public double getBalance() {
        return super.getBalance() + cashCredit;
    }
}

