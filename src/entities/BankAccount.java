package entities;

import interfaces.AccountDetails;
import interfaces.AccountOperations;

public class BankAccount extends Account implements AccountDetails, AccountOperations {
    private double balance;

    public BankAccount(){}

    public BankAccount(String id, String accountHolder, String accountType, String status, double initialBalance){
        super(id, accountHolder, accountType, status);
        this.balance = initialBalance;
    }


    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Error. El deposito debe ser positivo");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("No sé puede retirar el valor solicitado");
        }
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
