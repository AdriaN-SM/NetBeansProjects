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
 * @author jLopez
 */
public class ActivacionAperturaTest {

    @DataProvider(name = "testAP")
    public static Object[][] primeNumbers() {
        return new Object[][]{{true, true, true}, {true, true, false}, 
            {true, false, true}, {false, true, true}, {false, false, true}};
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
     * Test of activacionApertura method, of class TablaDecision.
     */
    @Test(dataProvider = "testAP")
    public void testActivacionApertura(Boolean a, Boolean b, Boolean c) {
        System.out.println("activacionApertura");
        Boolean result = ActivacionApertura.activacionApertura(a, b, c);
        assertTrue(result);
    }

}
