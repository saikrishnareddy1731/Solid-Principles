package com.solid.principles;

import com.solid.principles.dependencyinversion.good.AddOperations;
import com.solid.principles.dependencyinversion.good.Calculators;
import com.solid.principles.interfacesegregation.good.DBDaoConnection;
import com.solid.principles.interfacesegregation.good.FileDaoConnection;
import com.solid.principles.liskov.good.*;
import com.solid.principles.openclosed.AddOperation;
import com.solid.principles.openclosed.Calculator;
import com.solid.principles.singleresponsiblity.Account;
import com.solid.principles.singleresponsiblity.AccountOperations;
import com.solid.principles.singleresponsiblity.TransactionOperations;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("###################Solid principles###################################");
        System.out.println("###################Single responsibility principles###################");
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("Vishrut");
        account.setTotalAmount(BigDecimal.valueOf(100000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);


        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123),123);


        System.out.println("###################Open close principles#############################");
        Calculator calc = new Calculator();
        int result = calc.calculateNumber(5, 3, new AddOperation());
        System.out.println("Calculation of 2 numbers : "+result);


        System.out.println("###################Liskov Substitution principles######################");
        // Using CreditCardLoan (only doPayment works)
        LoanPayment ccLoan = new CreditCardLoan();
        ccLoan.doPayment(5000);

        // Using HomeLoan (both doPayment and foreclosure work)
        SecureLoan homeLoan = new HomeLoan();
        homeLoan.doPayment(20000);

        // Foreclosure service for secure loans
        LoanClosureService closureService = new LoanClosureService(homeLoan);
        closureService.foreCloseLoan();
//        The reason we created LoanClosureService is just to showcase dependency inversion + LSP — instead of clients calling foreclosure directly, they depend on an abstraction (SecureLoan).
//                So, both are valid:
//        Direct call → homeLoan.foreCloseLoan()
//        Through service → new LoanClosureService(homeLoan).foreCloseLoan();
//        The service is just there to demonstrate proper design, not necessity.

        // If we try to pass CreditCardLoan to LoanClosureService -> compile-time error
        // LoanClosureService badService = new LoanClosureService(new CreditCardLoan()); //  not allowed


        System.out.println("###################Interface Segregation principles######################");
        // Using DB implementation
        DBDaoConnection dbDao = new DBDaoConnection();
        dbDao.openConnection();
        dbDao.createRecord();
        dbDao.deleteRecord();

        System.out.println("-------------------");

        // Using File implementation
        FileDaoConnection fileDao = new FileDaoConnection();
        fileDao.openFile();
        fileDao.createRecord();
        fileDao.deleteRecord();


        System.out.println("###################Dependency inversion principles#############################");
        Calculators cal = new Calculators();
        int res = cal.calculate(5, 3, new AddOperations());
        System.out.println("Calculations of 2 numbers : "+res);

    }
}