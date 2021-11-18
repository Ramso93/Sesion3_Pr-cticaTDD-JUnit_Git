/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramso
 */
public class CuentaTest {
    Cuenta c1, c2;
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1 = new Cuenta(100.0, "ES123456789", "52022591H");
        c2 = new Cuenta(100.0, "ES123456789", "52022591H");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 50.0;
        try {
            c1.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Error retirar: No se puede retirar");
        }
        System.out.println("Retirada de "+c1.getNumCuenta()+". Saldo actual: " + c1.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRetirar_CantidadNegativa() {
        System.out.println("retirar cantidad negativa");
        double cantidad = -200.0;
        try {
            c1.retirar(cantidad);
            System.out.println("Retirada de "+c1.getNumCuenta()+". Saldo actual: " + c1.getSaldo());
        } catch (Exception e) {
            System.out.println("Error retirar cant. negativa: No se puede retirar cantidades negativas");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of ingresar method, of class Cuenta.
     */
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 100.0;
        try {
            c1.ingresar(cantidad);
            System.out.println("Ingreso a "+c1.getNumCuenta()+", saldo actual: "+c1.getSaldo());
        } catch (Exception e) {
            System.out.println("Error ingresar");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIngresar_Negativo() {
        System.out.println("ingresar negativo");
        double cantidad = -100.0;
        try {
            c1.ingresar(cantidad);
            System.out.println("Ingreso a "+c1.getNumCuenta()+", saldo actual: "+c1.getSaldo());
        } catch (Exception e) {
            System.out.println("Error ingresar negativo: No se puede ingresar cantidades negativas");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        double result = c1.getSaldo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCuenta method, of class Cuenta.
     */
    @Test
    public void testGetNumCuenta() {
        System.out.println("getNumCuenta");
        String expResult = c1.getNumCuenta();
        String result = c1.getNumCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
