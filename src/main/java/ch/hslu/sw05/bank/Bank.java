/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw05.bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> sourceAccounts = new ArrayList<>();
    ArrayList<BankAccount> targetAccounts = new ArrayList<>();


    public Bank(final int amountAccounts, final int initialBalance){
        this.createAccounts(amountAccounts, initialBalance);
    }

    private void createAccounts(final int amount, final int initialBalance){
        for(int i = 0; i<amount; i++){
            this.sourceAccounts.add(new BankAccount(initialBalance));
            this.targetAccounts.add(new BankAccount(initialBalance));
        }
    }

    public void executeTransfers(int amount){
        final int number = sourceAccounts.size();
        final Thread[] threads = new Thread[number * 2];
        for(int i = 0; i < sourceAccounts.size(); i++){
            threads[i] = new Thread(new AccountTask(sourceAccounts.get(i), targetAccounts.get(i), amount));
            threads[i + number] = new Thread(new AccountTask(targetAccounts.get(i), sourceAccounts.get(i), amount));
        }
        for(final Thread thread : threads){
            thread.start();
        }
    }

    @Override
    public String toString() {
        String returnValue = "";
        for(int i = 0; i< targetAccounts.size(); i++){
            returnValue += "Account " + i+ " Balance = " + targetAccounts.get(i).getBalance() + "\n";
        }
        return returnValue;
    }
}
