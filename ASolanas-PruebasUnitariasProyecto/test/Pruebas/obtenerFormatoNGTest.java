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
public class obtenerFormatoNGTest {
    
    public obtenerFormatoNGTest() {
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
     * Test of obtenerFormato method, of class obtenerFormato.
     */
    @Test
    public void test1ObtenerFormato() {
        System.out.println("obtenerFormato");
        String texto = "Texto de ejemplo";
        Boolean mayusculas = true;
        Boolean espacio = true;
        String expResult = "TEXTODEEJEMPLO";
        String result = obtenerFormato.obtenerFormato(texto, mayusculas, espacio);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test2ObtenerFormato() {
        System.out.println("obtenerFormato");
        String texto = "Texto de ejemplo";
        Boolean mayusculas = true;
        Boolean espacio = false;
        String expResult = "TEXTO DE EJEMPLO";
        String result = obtenerFormato.obtenerFormato(texto, mayusculas, espacio);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test3ObtenerFormato() {
        System.out.println("obtenerFormato");
        String texto = "Texto de ejemplo";
        Boolean mayusculas = false;
        Boolean espacio = true;
        String expResult = "textodeejemplo";
        String result = obtenerFormato.obtenerFormato(texto, mayusculas, espacio);
        assertEquals(result, expResult);
    }
    
    @Test
    public void test4ObtenerFormato() {
        System.out.println("obtenerFormato");
        String texto = "Texto de ejemplo";
        Boolean mayusculas = false;
        Boolean espacio = false;
        String expResult = "texto de ejemplo";
        String result = obtenerFormato.obtenerFormato(texto, mayusculas, espacio);
        assertEquals(result, expResult);
    }
    
}
