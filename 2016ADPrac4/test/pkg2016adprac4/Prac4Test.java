/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016adprac4;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k
 */
public class Prac4Test {

    public Prac4Test() {
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
     * Test of max3 method, of class Prac4.
     */
    @Test
    public void testMax3() {
        System.out.println("max3");
        int num1 = 9;
        int num2 = 8;
        int num3 = 4;
        int expResult = 9;
        int result = Prac4.max3(num1, num2, num3);
        assertEquals(expResult, result);

    }

    @Test
    public void testMax3v2() {
        System.out.println("max3");
        int num1 = 0;
        int num2 = 0;
        int num3 = -9;
        int expResult = 0;
        int result = Prac4.max3(num1, num2, num3);
        assertEquals(expResult, result);

    }

    @Test
    public void testMax3v3() {
        System.out.println("max3");
        int num1 = 1;
        int num2 = 1;
        int num3 = -1;
        int expResult = 1;
        int result = Prac4.max3(num1, num2, num3);
        assertEquals(expResult, result);

    }

    /**
     * Test of concat method, of class Prac4.
     */
    @Test
    public void testConcat() {
        System.out.println("concat");
        ArrayList<String> arr = null;
        String expResult = "";
        boolean pass = false;
        try {
            String result = Prac4.concat(arr);
        } catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    @Test
    public void testConcatv2() {
        System.out.println("concat");
        ArrayList<String> arr = new ArrayList();
        String expResult = "";
        arr.add("hi");
        arr.add("ho");
        arr.add("");
        arr.add("off");
        arr.add("to");
        arr.add("work");
        expResult = "hihoofftowork";
        assertEquals(expResult, Prac4.concat(arr));
    }

    /**
     * Test of sums1 method, of class Prac4.
     */
    @Test
    public void testSums1() {
        System.out.println("sums1");
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(1);
        int expResult = 2;
        int result = Prac4.sums1(arr);
        assertEquals(expResult, result);

    }

    @Test
    public void testSums1v2() {
        System.out.println("sums1");
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        int expResult = 2;
        int result = Prac4.sums1(arr);
        assertEquals(expResult, result);

    }
    @Test
    public void testSums1v3() {
        System.out.println("sums1");
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(6);
        int expResult = 7;
        int result = Prac4.sums1(arr);
        assertEquals(expResult, result);

    }

}
