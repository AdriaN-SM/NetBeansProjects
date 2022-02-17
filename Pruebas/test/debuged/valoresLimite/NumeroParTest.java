/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.valoresLimite;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * https://github.com/junit-team/junit4/wiki/parameterized-tests
 * https://www.tutorialspoint.com/testng/testng_parameterized_test.htm
 */
public class NumeroParTest {

    @DataProvider(name = "testNP")
    public static Object[] data() {
        return new Object[]{1, 3, 5};
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
     * Test of esPar method, of class NumeroPrimo.
     *
     * @param numero
     */
    @Test(dataProvider = "testNP")
    public void testEsPar(Integer numero) {
        System.out.println("esPar " + numero);
        NumeroPar instance = new NumeroPar();
        assertFalse(instance.esPar(numero));
    }

}
