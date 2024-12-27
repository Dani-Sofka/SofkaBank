package entities;

import interfaces.AccountDetails;

public class Account implements AccountDetails {

    private String id;
    private String accountHolder;
    private String accountType;
    private String status;

    public Account(){}

    public Account(String id, String accountHolder, String accountType, String status){
        this.id = id;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.status = status;
    }

    public String getId(){
        return id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void closeAccount() {
        this.status = "Closed";
    }
}
