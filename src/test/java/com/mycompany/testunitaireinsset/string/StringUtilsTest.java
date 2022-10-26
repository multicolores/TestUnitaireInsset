/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author insset
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineInValide() {
        exceptionRule.expectMessage("Il faut au moins deux caractere en entrée");
        //given
        String str = "t";
        StringUtils instance = new StringUtils();
        ExpectedException expResult = exceptionRule;

        //when
        boolean result = instance.isChaineValide(str);

        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsChaineValide() {
        //given
        String str = "toto";
        StringUtils instance = new StringUtils();
        boolean expResult = true;

        //when
        boolean result = instance.isChaineValide(str);

        //then
        assertEquals(expResult, result);
    }
    

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        //given
        String str = "toma";
        StringUtils instance = new StringUtils();
        String expResult = "amot";

        //when
        String result = instance.inverse(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        //given
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;

        //when
        boolean result = instance.isPalindrome(str);

        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNotPalindrome() {
        //given
        String str = "kaya";
        StringUtils instance = new StringUtils();
        boolean expResult = false;

        //when
        boolean result = instance.isPalindrome(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        //given
        Map<String, Integer> map;
        map = new TreeMap<>();
        String str = "voiv";
        map.put("v",2);
        map.put("o",1);
        map.put("i",1);
        map.put("v",2);
        
        StringUtils instance = new StringUtils();
        
        Map<String, Integer> expResult = map;

        //when
        Map<String, Integer> result = instance.compterOccurences(str);

        //then
        assertEquals(expResult, result);
    }
    
}
