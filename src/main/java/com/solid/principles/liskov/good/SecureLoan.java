package com.solid.principles.liskov.good;

public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
