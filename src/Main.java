import entities.BankAccount;
import entities.CheckingAccountFactory;
import entities.SavingsAccountFactory;
import patterns.factory.AccountFactory;
import patterns.singleton.AccountManager;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String status = "Active";

        AccountFactory savingFactory = new SavingsAccountFactory();
        AccountFactory checkingFactory = new CheckingAccountFactory();

        BankAccount account1 = savingFactory.createAccount("123da", "Daniel Rúa", "savings", status, 0);
        BankAccount account2 = checkingFactory.createAccount("123al", "Alejandra Villa", "checking", status,0);

        AccountManager accountManager = AccountManager.getInstance();

        accountManager.addAccount(account1);
        accountManager.addAccount(account2);

        account1.deposit(150);
        account1.withdraw(100);
        account1.closeAccount();

        account2.deposit(150);
        account2.withdraw(100);
        account2.closeAccount();

        System.out.println("------------ Cuentas después de las operaciones ------------");
        accountManager.getAccount("123al");
        accountManager.displayAccounts();
    }
}