/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.valoresLimite;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author adria
 */
public class NumeroPrimoNGTest {
    
    @DataProvider(name = "testNPNGT")
    public static Object[][] activationValues() {
        return new Object[][]{
            {0, true}, 
            {1, true}, 
            {2, true}, 
            {3, true}, 
            {-5, true}, 
            {7, true}, 
            {9, false}};
    }
    
    public NumeroPrimoNGTest() {
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
     * Test of esPrimo method, of class NumeroPrimo.
     */
    @Test(dataProvider = "testNPNGT")
    public void testEsPrimo(int numero, boolean expResult) {
        System.out.println("esPrimo");
        boolean result = NumeroPrimo.esPrimo(numero);
        assertEquals(result, expResult);
    }
    
}
