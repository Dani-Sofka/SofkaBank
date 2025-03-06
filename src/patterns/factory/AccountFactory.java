package patterns.factory;

import entities.BankAccount;

public interface AccountFactory {
    BankAccount createAccount(String id, String accountHolder, String accountType, String status, double initialBalance);
}
