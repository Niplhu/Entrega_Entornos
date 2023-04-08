/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package ex.entornos;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class VocalsNGTest {

    public VocalsNGTest() {
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
     * Test of esVocal method, of class Vocals.
     */
    @Test
    public void testEsVocal() {
        System.out.println("esVocal");
        String lletra = "a";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsVocal2() {
        System.out.println("esVocal");
        String lletra = "A";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsVoca3() {
        System.out.println("esVocal");
        String lletra = "á";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsVoca4() {
        System.out.println("esVocal");
        String lletra = "cadena";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsVocal5() {
        System.out.println("esVocal");
        String lletra = "b";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsVocal6() {
        System.out.println("esVocal");
        String lletra = "B";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
