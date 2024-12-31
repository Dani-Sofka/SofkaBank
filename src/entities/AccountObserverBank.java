package entities;

import patterns.obverser.AccountObserver;

public class AccountObserverBank implements AccountObserver {
    private String observerName;

    public AccountObserverBank(String name){
        this.observerName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + " recibió la notificación: " + message);
    }
}
