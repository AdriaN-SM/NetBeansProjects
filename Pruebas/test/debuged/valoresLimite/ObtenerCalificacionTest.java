
package debuged.valoresLimite;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ObtenerCalificacionTest {
    
    public ObtenerCalificacionTest() {
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
     * Test of obtenerCalificacion method, of class ValoresLimite.
     */
    @Test
    public void testObtenerCalificacion() {
        System.out.println("obtenerCalificacion");
        Double resultado = 9.5;
        String expResult = ObtenerCalificacion.SOBRESALIENTE;
        String result = ObtenerCalificacion.obtenerCalificacion(resultado);
        assertEquals(result, expResult);
    }
    
    @Test
    public void testObtenerCalificacion2() {
        System.out.println("obtenerCalificacion");
        Double resultado = 10.5;
        String expResult = null;
        String result = ObtenerCalificacion.obtenerCalificacion(resultado);
        assertEquals(result, expResult);
    }
    
}
