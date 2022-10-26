/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisiblePar() {
        //given
        long n = 5;
        long val = 10;
        Parfait instance = new Parfait();
        boolean expResult = true;

        //when
        boolean result = instance.estDivisiblePar(n,val);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseurs() {
        //given
        long val = 4;
        Parfait instance = new Parfait();
        long[] expResult = {1,4,2};
        
        //when
        long[] result = instance.diviseurs(val);

        //then
        Assert.assertArrayEquals(expResult, result);
        //Assert.assertTrue("OK", result);
    }

    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfait() {
       //given
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;

        //when
        boolean result = instance.estParfait(val);

        //then
        assertEquals(expResult, result);
    }
    
        @Test
    public void testEstImParfait() {
       //given
        long val = 5;
        Parfait instance = new Parfait();
        boolean expResult = false;

        //when
        boolean result = instance.estParfait(val);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultParfait() {
       //given
        long nb = 6;
        boolean isParfait = true;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " est parfait";

        //when
        String result = instance.formaterResult(isParfait, nb);

        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFormaterResultImParfait() {
       //given
        long nb = 5;
        boolean isParfait = false;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " n'est pas parfait";

        //when
        String result = instance.formaterResult(isParfait, nb);

        //then
        assertEquals(expResult, result);
    }
    
}
