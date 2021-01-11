/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjmar
 */
public class FlightTest {
    
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
     * Test of setFlightNumber method, of class Flight.
     *
     */
    
    //  public Flight (int f,String o,String d,String t, int c,double p){
  
    public void testConstructor(){
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() throws IllegalArgumentException{
        
    }
    @Test
    public void testSetFlightNumber(){
        System.out.println("setFlightNumber");
        int f = 0;
        Flight instance = null;
        instance.setFlightNumber(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test 
    public void testGetFlightNumber(){
        System.out.println("getFlightNumber");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test 
    public void testSetOrigin(){
        System.out.println("setOrigin");
        String o = "";
        Flight instance = null;
        instance.setOrigin(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetOrigin(){
        System.out.println("getOrigin");
        Flight instance = null;
        String expResult = "";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String d = "";
        Flight instance = null;
        instance.setDestination(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = null;
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    @Test 
    public void testSetDepartureTime(){
        System.out.println("setDepartureTime");
        String t = "";
        Flight instance = null;
        instance.setDepartureTime(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetDepartureTime(){
        System.out.println("getDepartureTime");
        Flight instance = null;
        String expResult = "";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test 
    public void testSetCapacity(){
        System.out.println("setCapacity");
        int c = 0;
        Flight instance = null;
        instance.setCapacity(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCapacity(){
        System.out.println("getCapacity");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrice(){
        System.out.println("setPrice");
        double p = 0.0;
        Flight instance = null;
        instance.setPrice(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrice(){
        System.out.println("getPrice");
        Flight instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNumberOfSeatsLeft(){
        System.out.println("setNumberOfSeatsLeft");
        int s = 0;
        Flight instance = null;
        instance.setnumberOfSeatsLeft(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNumberOfSeatsLeft(){
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getnumberOfSeatsLeft();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testBookaSeat(){
         System.out.println("bookASeat");
        Flight instance = null;
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testtoString(){
        System.out.println("toString");
        Flight instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

