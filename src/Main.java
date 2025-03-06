import entities.AccountObserverBank;
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

        /**
         * Se usa el patron de diseño Factory para la creación de objetos.
         */
        AccountFactory savingFactory = new SavingsAccountFactory();
        AccountFactory checkingFactory = new CheckingAccountFactory();
        BankAccount account1 = savingFactory.createAccount("123da", "Daniel Rúa", "savings", status, 0);
        BankAccount account2 = checkingFactory.createAccount("123al", "Alejandra Villa", "checking", status,0);


        /**
         * Se usa el patron de diseño Observer para la notificación de eventos.
         */
        AccountObserverBank observer1 = new AccountObserverBank("observer1");
        AccountObserverBank observer2 = new AccountObserverBank("observer2");
        account1.registerObserver(observer1);
        account2.registerObserver(observer2);


        /**
         * Se realizan operaciones.
         */
        account1.deposit(150);
        account1.withdraw(100);
        account1.closeAccount();

        account2.deposit(150);
        account2.withdraw(50);
        account2.closeAccount();

        /**
         * Se usa el patron de diseño Singleton para qe tenga una única instancia.
         */
        System.out.println("------------ Cuentas después de las operaciones ------------");
        AccountManager accountManager = AccountManager.getInstance();
        accountManager.addAccount(account1);
        accountManager.addAccount(account2);
        accountManager.getAccount("123al");
        accountManager.displayAccounts();
    }
}