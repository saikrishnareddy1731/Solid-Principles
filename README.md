# SOLID Principles in Java

This project demonstrates the SOLID principles of object-oriented design with Java examples.  
SOLID is a set of five design principles that make software more maintainable, extensible, and robust.

---

## 1. Single Responsibility Principle (SRP)
A class should have only one reason to change.  
Each class should focus on a single responsibility.

- **Good Example:** Separating business logic from database logic.  
- **Bad Example:** One class handling payments, database writes, and reporting.

---

## 2. Open/Closed Principle (OCP)
Software entities should be open for extension but closed for modification.  
You should be able to add new behavior without altering existing code.

- **Good Example:** Adding new operations (Add, Subtract, Multiply) by creating new classes, not modifying the `Calculator` class.

---

## 3. Liskov Substitution Principle (LSP)
Subtypes must be substitutable for their base types without breaking the program.

- **Good Example:**  
  - `HomeLoan` (a secure loan) supports foreclosure.  
  - `CreditCardLoan` does not, so it only implements `LoanPayment`.  
  - Code depending on `SecureLoan` can safely work with `HomeLoan` but not with `CreditCardLoan`.

---

## 4. Interface Segregation Principle (ISP)
Clients should not be forced to depend on methods they do not use.

- **Good Example:**  
  - `DBDaoConnection` implements `DBInterface` + `DAOInterface`.  
  - `FileDaoConnection` implements `FileInterface` + `DAOInterface`.  
  - Each consumer depends only on the interfaces it needs.

---

## 5. Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules.  
Both should depend on abstractions.

- **Good Example:**  
  - A service class depends on an interface, not a concrete database or file implementation.  
  - This makes swapping implementations easy (e.g., Database → File, or a mock implementation for testing).

---

## Benefits of Applying SOLID
- Cleaner, modular code  
- Easier testing and debugging  
- Reduces code duplication  
- Encourages reuse and extensibility


// ################### CODE OUTPUT ########################################
// ################### Solid Principles ###################################

// ################### Single Responsibility Principle ####################
// Account Added Successfully
// Get Account : Vishrut, 123, 100000
// Deposited Successfully

// ################### Open/Closed Principle ##############################
// Calculation of 2 numbers: 8

// ################### Liskov Substitution Principle ######################
// Credit Card Loan: Paid amount 5000
// Home Loan: Paid amount 20000
// Home Loan: Foreclosure done successfully

// ################### Interface Segregation Principle ###################
// Database Operations:
// DB: Opening database connection
// DB: Creating record in database
// DB: Deleting record from database
//
// File Operations:
// File: Opening file
// File: Creating record in file
// File: Deleting record from file

// ################### Dependency Inversion Principle #####################
// Calculation of 2 numbers: 8

