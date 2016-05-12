/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016adprac4;

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
public class StudentTest {

    /**
     *
     */
    Student testStudent;

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testStudent = new Student(1, "Bloggs", "Fred", 1980);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIdNumber method, of class Student.
     */
    @Test
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        Student instance = new Student(1, "Bloggs", "Fred", 1980);
        int expResult = 1;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdNumberv2() {
        System.out.println("getIdNumber");
        Student instance = new Student(-1, "Bloggs", "Fred", 1980);
        int expResult = -1;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFamilyName method, of class Student.
     */
    @Test
    public void testGetFamilyName() {
        System.out.println("getFamilyName");
        Student instance = new Student(-1, "", "Fred", 1980);
        String expResult = "";
        String result = instance.getFamilyName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetFamilyNamev2() {
        System.out.println("getFamilyName");
        Student instance = new Student(-1, "Christ", "Fred", 1980);
        String expResult = "Christ";
        String result = instance.getFamilyName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPersonalName method, of class Student.
     */
    @Test
    public void testGetPersonalName() {
        System.out.println("getPersonalName");
        Student instance = new Student(-1, "Christ", "Fred", 1980);
        String expResult = "Fred";
        String result = instance.getPersonalName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPersonalNamev2() {
        System.out.println("getPersonalName");
        Student instance = new Student(-1, "Christ", "", 1980);
        String expResult = "";
        String result = instance.getPersonalName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYearOfBirth method, of class Student.
     */
    @Test
    public void testGetYearOfBirth() {
        System.out.println("getYearOfBirth");
        Student instance = new Student(-1, "Christ", "Fred", 1980);
        int expResult = 1980;
        int result = instance.getYearOfBirth();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetYearOfBirthv2() {
        System.out.println("getYearOfBirth");
        Student instance = new Student(-1, "Christ", "Fred", -1980);
        int expResult = -1980;
        int result = instance.getYearOfBirth();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFamilyName method, of class Student.
     */
    @Test
    public void testSetFamilyName() {
        System.out.println("setFamilyName");
        String familyName = "";
        testStudent.setFamilyName(familyName);
        assertEquals(familyName, testStudent.getFamilyName());

    }

    @Test
    public void testSetFamilyNamev2() {
        System.out.println("setFamilyName");
        String familyName = "Once upon a time, there was a little girl named Victor";
        testStudent.setFamilyName(familyName);
        assertEquals(familyName, testStudent.getFamilyName());

    }

    /**
     * Test of setPersonalName method, of class Student.
     */
    @Test
    public void testSetPersonalName() {
        System.out.println("setPersonalName");
        String personalName = "";
        testStudent.setPersonalName(personalName);
        assertEquals(personalName, testStudent.getPersonalName());
    }

    @Test
    public void testSetPersonalNamev2() {
        System.out.println("setPersonalName");
        String personalName = "It was the best of times, it was the worst of times";
        testStudent.setPersonalName(personalName);
        assertEquals(personalName, testStudent.getPersonalName());
    }

    /**
     * Test of setYearOfBirth method, of class Student.
     */
    @Test
    public void testSetYearOfBirth() {
        System.out.println("setYearOfBirth");
        int yearOfBirth = 0;
        testStudent.setYearOfBirth(yearOfBirth);
        assertEquals(yearOfBirth, testStudent.getYearOfBirth());
    }

    @Test
    public void testSetYearOfBirthv2() {
        System.out.println("setYearOfBirth");
        int yearOfBirth = 938278460;
        testStudent.setYearOfBirth(yearOfBirth);
        assertEquals(yearOfBirth, testStudent.getYearOfBirth());
    }

}
