package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Validates that our add function correctly computes 2 + 2 = 4
        assertEquals(4, calc.add(2, 2)); 
    }
}

