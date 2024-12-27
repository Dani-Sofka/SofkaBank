package entities;

import interfaces.AccountDetails;
import interfaces.AccountOperations;

public class BankAccount extends Account implements AccountDetails, AccountOperations {
    private double balance;

    public BankAccount(){}

    public BankAccount(String id, String accountHolder, String accountType, double initialBalance){
        super(id, accountHolder, accountType);
        this.balance = initialBalance;
    }

    








    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void closeAccount() {
        super.closeAccount();
    }
}
