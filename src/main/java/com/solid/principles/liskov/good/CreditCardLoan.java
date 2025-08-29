package com.solid.principles.liskov.good;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {
        System.out.println("Credit Card Loan: Paid amount " + amount);
    }

}
