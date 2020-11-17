/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.imposto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cirim
 */
public class ImpostoIT {
    
    public ImpostoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of valorDaMulta method, of class Imposto.
     */
    @Test
    public void testValorDaMulta() {
        System.out.println("valorDaMulta");
        Imposto instance = new Imposto();
        instance.setNumeroRegisto(1.0);
        instance.setValorImposto(100.00);
        instance.setMesAtraso(1.0);
        double expResult = 1.0;
        double result = instance.valorDaMulta();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of mesDeAtraso method, of class Imposto.
     */
    @Test
    public void testMesDeAtraso() {
        System.out.println("mesDeAtraso");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.mesDeAtraso();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of valorDoToal method, of class Imposto.
     */
    @Test
    public void testValorDoToal() {
        System.out.println("valorDoToal");
        Imposto instance = new Imposto();
        instance.setNumeroRegisto(1.0);
        instance.setValorImposto(100.00);
        instance.setMesAtraso(1.0);
        double expResult = 101.0;
        double result = instance.valorDoToal();
        assertEquals(expResult, result, 101.0);
        
    }

    /**
     * Test of getNumeroRegisto method, of class Imposto.
     */
    @Test
    public void testGetNumeroRegisto() {
        System.out.println("getNumeroRegisto");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.getNumeroRegisto();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setNumeroRegisto method, of class Imposto.
     */
    @Test
    public void testSetNumeroRegisto() {
        System.out.println("setNumeroRegisto");
        double numeroRegisto = 0.0;
        Imposto instance = new Imposto();
        instance.setNumeroRegisto(numeroRegisto);
        
    }

    /**
     * Test of getValorImposto method, of class Imposto.
     */
    @Test
    public void testGetValorImposto() {
        System.out.println("getValorImposto");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.getValorImposto();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setValorImposto method, of class Imposto.
     */
    @Test
    public void testSetValorImposto() {
        System.out.println("setValorImposto");
        double valorImposto = 0.0;
        Imposto instance = new Imposto();
        instance.setValorImposto(valorImposto);
       
    }

    /**
     * Test of getValorMulta method, of class Imposto.
     */
    @Test
    public void testGetValorMulta() {
        System.out.println("getValorMulta");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.getValorMulta();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setValorMulta method, of class Imposto.
     */
    @Test
    public void testSetValorMulta() {
        System.out.println("setValorMulta");
        double valorMulta = 0.0;
        Imposto instance = new Imposto();
        instance.setValorMulta(valorMulta);
      
    }

    /**
     * Test of getMesAtraso method, of class Imposto.
     */
    @Test
    public void testGetMesAtraso() {
        System.out.println("getMesAtraso");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.getMesAtraso();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setMesAtraso method, of class Imposto.
     */
    @Test
    public void testSetMesAtraso() {
        System.out.println("setMesAtraso");
        double mesAtraso = 0.0;
        Imposto instance = new Imposto();
        instance.setMesAtraso(mesAtraso);
       
    }

    /**
     * Test of getValorTotal method, of class Imposto.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Imposto instance = new Imposto();
        double expResult = 0.0;
        double result = instance.getValorTotal();
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of setValorTotal method, of class Imposto.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        double valorTotal = 0.0;
        Imposto instance = new Imposto();
        instance.setValorTotal(valorTotal);
        
    }
    
}
