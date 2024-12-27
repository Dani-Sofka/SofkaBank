import entities.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String status = "Active";

        Map<String, BankAccount> bankAccount = new HashMap<>();

        BankAccount account1 = new BankAccount("123da", "Daniel Rúa", "savings", status, 100);
        BankAccount account2 = new BankAccount("123al", "Alejandra Villa", "checking", status,150);
        BankAccount account3 = new BankAccount("123pa", "Paco Villa", "checking", status,200);
        BankAccount account4 = new BankAccount("123li", "Lila Villa", "savings", status,50);

        bankAccount.put(account1.getId(), account1);
        bankAccount.put(account2.getId(), account2);
        bankAccount.put(account3.getId(), account3);
        bankAccount.put(account4.getId(), account4);

        System.out.println("--------------------------------");
        bankAccount.forEach((id, account) -> {
            System.out.println("Account ID: " + id);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Status: " + account.getStatus());
            System.out.println("--------------------------------");
        });

        //account2.deposit(0);

        System.out.println("Estado de las cuentas despues del depósito");
        System.out.println("--------------------------------");
        bankAccount.forEach((id, account) -> {
            System.out.println("Account ID: " + id);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Status: " + account.getStatus());
            System.out.println("--------------------------------");
        });

        //account1.withdraw(200);

        System.out.println("Estado de las cuentas despues del retiro");
        System.out.println("--------------------------------");
        bankAccount.forEach((id, account) -> {
            System.out.println("Account ID: " + id);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Status: " + account.getStatus());
            System.out.println("--------------------------------");
        });

        //account1.closeAccount();

        System.out.println("Estado de las cuentas despues del cierre de cuenta");
        System.out.println("--------------------------------");
        bankAccount.forEach((id, account) -> {
            System.out.println("Account ID: " + id);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Status: " + account.getStatus());
            System.out.println("--------------------------------");
        });


    }
}