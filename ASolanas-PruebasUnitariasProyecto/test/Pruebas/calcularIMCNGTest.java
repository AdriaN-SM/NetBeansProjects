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
public class calcularIMCNGTest {
    
    public calcularIMCNGTest() {
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
     * Test of calcularIMC method, of class calcularIMC.
     */
    
    @Test
    public void test1CalcularIMC() {
        System.out.println("calcularIMC");
        float peso = 35.0F;
        float altura = 1.50F;
        String expResult = "Delgadez";
        String result = calcularIMC.calcularIMC(peso, altura);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test2CalcularIMC() {
        System.out.println("calcularIMC");
        float peso = 82.0F;
        float altura = 1.85F;
        String expResult = "Normal";
        String result = calcularIMC.calcularIMC(peso, altura);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test3CalcularIMC() {
        System.out.println("calcularIMC");
        float peso = 65.0F;
        float altura = 1.50F;
        String expResult = "Sobrepeso";
        String result = calcularIMC.calcularIMC(peso, altura);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test4CalcularIMC() {
        System.out.println("calcularIMC");
        float peso = 110.0F;
        float altura = 1.80F;
        String expResult = "Obesidad";
        String result = calcularIMC.calcularIMC(peso, altura);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test5CalcularIMC() {
        System.out.println("calcularIMC");
        float peso = 0.0F;
        float altura = 0.0F;
        String expResult = "Desconocido";
        String result = calcularIMC.calcularIMC(peso, altura);
        assertEquals(result, expResult);
    }
    
}
