package entities;

import interfaces.AccountOperations;
import patterns.obverser.AccountObserver;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Account implements AccountOperations {
    private double balance;
    private List<AccountObserver> observers = new ArrayList<>();

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
            notifyObservers("Se ha realizado un retiro de " + amount);
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

    public void registerObserver(AccountObserver observer){
        observers.add(observer);
    }

    private void notifyObservers(String message){
        for (AccountObserver observer : observers) {
            observer.update(message);
        }
    }
}
