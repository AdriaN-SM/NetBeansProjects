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
import org.testng.annotations.Test;

/**
 *
 * @author adria
 */
public class TablaDecisionNGTest {
    
    public TablaDecisionNGTest() {
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
    @Test
    public void testActivacionApertura() {
        System.out.println("activacionApertura");
        Boolean a = false;
        Boolean b = false;
        Boolean c = true;
        Boolean expResult = false;
        Boolean result = TablaDecision.activacionApertura(a, b, c);
        assertEquals(result, expResult);
    }
    
}
