/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author adria
 */
public class calcularFactorialNGTest {
    
    public calcularFactorialNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of calcularFactorial method, of class calcularFactorial.
     */
    
    @Test
    public void test1CalcularFactorial() {
        System.out.println("calcularFactorial");
        Integer numero = 0;
        Integer expResult = 1;
        Integer result = calcularFactorial.calcularFactorial(numero);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test2CalcularFactorial() {
        System.out.println("calcularFactorial");
        Integer numero = 1;
        Integer expResult = 1;
        Integer result = calcularFactorial.calcularFactorial(numero);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test3CalcularFactorial() {
        System.out.println("calcularFactorial");
        Integer numero = 2;
        Integer expResult = 2;
        Integer result = calcularFactorial.calcularFactorial(numero);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test4CalcularFactorial() {
        System.out.println("calcularFactorial");
        Integer numero = 3;
        Integer expResult = 6;
        Integer result = calcularFactorial.calcularFactorial(numero);
        assertEquals(result, expResult);
    }
    
}
