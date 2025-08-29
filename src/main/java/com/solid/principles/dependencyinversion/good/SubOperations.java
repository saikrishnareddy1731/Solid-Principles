package com.solid.principles.dependencyinversion.good;

/**
 * One more sub module for substration
 */
public class SubOperations implements CalculatorOperation{
    public int calculate(int a, int b){
        return a-b;
    }
}