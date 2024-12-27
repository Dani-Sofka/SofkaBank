import entities.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String status = "Active";

        Map<String, BankAccount> bankAccount = new HashMap<>();

        BankAccount account1 = new BankAccount("123da", "Daniel Rúa", "savings", status, 100);
        BankAccount account2 = new BankAccount("123al", "Alejandra Villa", "checking", status,100);
        BankAccount account3 = new BankAccount("123pa", "Paco Villa", "checking", status,100);
        BankAccount account4 = new BankAccount("123li", "Lila Villa", "savings", status,100);

        bankAccount.put(account1.getId(), account1);
        bankAccount.put(account2.getId(), account2);
        bankAccount.put(account3.getId(), account3);
        bankAccount.put(account4.getId(), account4);

        account1.deposit(150);
        System.out.println("-----------------------------------");
        System.out.println("Cuentas después del depósito");
        System.out.println("-----------------------------------");
        displayAccountDetails(bankAccount);

        account1.deposit(50);
        System.out.println("-----------------------------------");
        System.out.println("Cuentas después del depósito");
        System.out.println("-----------------------------------");
        displayAccountDetails(bankAccount);

        account1.withdraw(100);
        System.out.println("-----------------------------------");
        System.out.println("Cuentas después del retiro");
        System.out.println("-----------------------------------");
        displayAccountDetails(bankAccount);

        account1.withdraw(0);
        System.out.println("-----------------------------------");
        System.out.println("Cuentas después del retiro");
        System.out.println("-----------------------------------");
        displayAccountDetails(bankAccount);

        account1.closeAccount();
        System.out.println("-----------------------------------");
        System.out.println("Cuentas después del cierre");
        System.out.println("-----------------------------------");
        displayAccountDetails(bankAccount);
    }

    private static void displayAccountDetails(Map<String, BankAccount> bankAccount) {
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