package com.solid.principles.singleresponsiblity;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static Map<Integer, Account> accountMap = new HashMap<>();
    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber() ,  account);
        System.out.println("Account Added Successfully");
    }

    public  void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber() ,  account);
        System.out.println("Account Updated Successfully");
    }

    public Account getAccount(int accountNumber) {
        Account account= accountMap.get(accountNumber);
        System.out.println("Get Account :"+account.getFirstName()+" , "+account.getAccountNumber()+" , "+ account.getTotalAmount());
        return account;
    }

    /** This method should not be part of AccountOperations
     * Reason is account operations are responsible for doing
     * operation for account like add account, update account
     * get account. However deposit is something called as transaction
     * which eventually not responsible by account.
     *
     * Adding this method violates Single Responsibility principle
     * Create new class which actually does TransactionOperations.
     * **/
    public void deposit(int amount , int accountNumber){
        //Move this method to different class
    }
}