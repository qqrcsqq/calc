/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itexps
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double num1 = 10.0;
        double num2 = 20.0;
        Calculator instance = new Calculator();
        double expResult = 30.0;
        double result = instance.add(num1, num2)+1;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double num1 = 100.0;
        double num2 = 50.5;
        Calculator instance = new Calculator();
        double expResult = 49.5;
        double result = instance.subtract(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    /*@Test
    public void testMultiply() {
        System.out.println("multiply");
        double num1 = 20.0;
        double num2 = 30.0;
        Calculator instance = new Calculator();
        double expResult = 600.0;
        double result = instance.multiply(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of divide method, of class Calculator.
     */
   /* @Test
    public void testDivide() {
        System.out.println("divide");
        double num1 = 10.0;
        double num2 = 5.0;
        Calculator instance = new Calculator();
        double expResult = 2.0;
        double result = instance.divide(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
}
