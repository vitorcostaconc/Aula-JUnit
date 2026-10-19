/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadoram;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somar method, of class calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int n1 = 8;
        int n2 = 6;
        calculadora instance = new calculadora();
        double expResult = 14.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 8;
        int n2 = 6;
        calculadora instance = new calculadora();
        double expResult = 2.0;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 8;
        int n2 = 6;
        calculadora instance = new calculadora();
        double expResult = 48.0;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 16;
        int n2 = 8;
        calculadora instance = new calculadora();
        double expResult = 2.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
