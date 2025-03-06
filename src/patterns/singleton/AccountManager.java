package patterns.singleton;

import entities.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

    private static AccountManager instance;

    private Map<String, BankAccount> accounts;

    private AccountManager(){
        accounts = new HashMap<>();
    }

    public static AccountManager getInstance(){
        if (instance == null){
            instance = new AccountManager();
        }
        return instance;
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getId(), account);
    }

    public String getAccount(String id) {
        if (accounts.containsKey(id)){
            System.out.println("Hola soy el ID recuperado" + id);
        }else {
            System.out.println("No se encontró la cuenta con el ID: " + id);
        }
        return null;
    }

    public void displayAccounts(){
        accounts.forEach((id, account) -> {
            System.out.println("Account ID: " + id);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Status: " + account.getStatus());
            System.out.println("--------------------------------");
        });
    }
}
