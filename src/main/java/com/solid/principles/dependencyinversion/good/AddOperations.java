package com.solid.principles.dependencyinversion.good;

/**
 * So we will have this class but it will be taken care
 * via interface implementation.
 *
 */
public class AddOperations implements CalculatorOperation {
    public int calculate(int a, int b){
        return a+b;
    }
}
