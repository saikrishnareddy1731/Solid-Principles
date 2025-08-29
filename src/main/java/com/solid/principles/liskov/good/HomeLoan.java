package com.solid.principles.liskov.good;

public class HomeLoan implements SecureLoan {
    @Override
    public void doPayment(int amount) {
        System.out.println("Home Loan: Paid amount " + amount);
    }

    @Override
    public void foreCloseLoan() {
        System.out.println("Home Loan: Foreclosure done successfully");
    }

}
