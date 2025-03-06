package entities;

import patterns.factory.AccountFactory;

public class SavingsAccountFactory implements AccountFactory {

    @Override
    public BankAccount createAccount(String id, String accountHolder, String accountType, String status, double initialBalance) {
        return new BankAccount(id, accountHolder, accountType, status, initialBalance);
    }
}
