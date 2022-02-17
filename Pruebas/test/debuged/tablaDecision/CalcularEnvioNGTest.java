/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.tablaDecision;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author jlopez
 */
public class CalcularEnvioNGTest {
    
    @DataProvider(name = "testCE")
    public static Object[][] primeNumbers() {
        return new Object[][]{{30, true, true, 105.0}, {120, true, false, 360.0},
            {410, false, true, 1255.0}, {650, false, true, 1975.0}};
    }
    public CalcularEnvioNGTest() {
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
     * Test of calcularEnvio method, of class CalcularEnvio.
     * @param unidades
     * @param peninsula
     * @param urgente
     * @param expResult
     */
    @Test(dataProvider = "testCE")
    public void testCalcularEnvio(Integer unidades, Boolean peninsula, Boolean urgente, Double expResult) {
        System.out.println("calcularEnvio");
        Double result = CalcularEnvio.calcularEnvio(unidades, peninsula, urgente);
        assertEquals(result, expResult);
    }
    
}
