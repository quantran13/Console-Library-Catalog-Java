/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.quantran.consoleLibraryCatalog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Utility class.
 * 
 * @author quan
 */
public class UtilityTest {
	
	public UtilityTest() {
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
	 * Test of isValidPatronID method, of class Utility.
	 */
	@Test
	public void testIsValidPatronID() {
		System.out.println("isValidPatronID");
		
		String patronID = "D99999999";
		boolean expResult = false;
		boolean result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "D01711540";
		expResult = true;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "D00123313";
		expResult = true;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "D0171154";
		expResult = false;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "E12711540";
		expResult = false;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "601711540";
		expResult = false;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "D017A1540";
		expResult = false;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
		
		patronID = "";
		expResult = false;
		result = Utility.isValidPatronID(patronID);
		assertEquals(expResult, result);
	}

	/**
	 * Test of isValidISBN method, of class Utility.
	 */
	@Test
	public void testIsValidISBN() {
		System.out.println("isValidISBN");
		
		String ISBN = "9780133454840";
		boolean expResult = true;
		boolean result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9780071809252";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9780071809252";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9781118858059";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9780321441461";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9781464110375";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9780321009715";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9781464104077";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9781285741550";
		expResult = true;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "9780071803252";
		expResult = false;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "978007180925";
		expResult = false;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
		
		ISBN = "";
		expResult = false;
		result = Utility.isValidISBN(ISBN);
		assertEquals(expResult, result);
	}
	
}
