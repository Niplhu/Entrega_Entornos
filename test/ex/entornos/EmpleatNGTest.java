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
public class EmpleatNGTest {

    public EmpleatNGTest() {
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
     * Test of calculaSalariBrut method, of class Empleat.
     */
    //@Test
    public void testCalculaSalariBrut() throws Exception {
        System.out.println("calculaSalariBrut");
        String tipusEmpleat = "venedor";
        double vendesMes = 1000;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1100;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaSalariBrut2() throws Exception {
        System.out.println("calculaSalariBrut");
        String tipusEmpleat = "encarregat";
        double vendesMes = 2500;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1500;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat.
     */
    @Test
    public void testCalculaSalariNet2() throws Exception {
        System.out.println("calculaSalariNet");
        double salariBrut = 0.0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
