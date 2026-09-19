package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Hello, Jenkins! My Java Calculator app is running successfully.");
        System.out.println("Test calculation (2 + 3) = " + calc.add(2, 3));
    }
}

