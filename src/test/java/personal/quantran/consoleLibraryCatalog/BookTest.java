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
 *
 * @author quan
 */
public class BookTest {

	public BookTest() {
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
	 * Test of setStatus method, of class Book.
	 */
	@Test
	public void testSetStatus() {
		System.out.println("setStatus");
		Constants.Status status = null;
		Book instance = new Book();
		instance.setStatus(status);
	}

	/**
	 * Test of setBookName method, of class Book.
	 */
	@Test
	public void testSetBookName() {
		System.out.println("setBookName");
		String bookName = "";
		Book instance = new Book();
		instance.setBookName(bookName);
	}

	/**
	 * Test of setBookISBN method, of class Book.
	 */
	@Test
	public void testSetBookISBN() {
		System.out.println("setBookISBN");
		String bookISBN = "";
		Book instance = new Book();
		instance.setBookISBN(bookISBN);
	}

	/**
	 * Test of setAuthorName method, of class Book.
	 */
	@Test
	public void testSetAuthorName() {
		System.out.println("setAuthorName");
		String authorName = "";
		Book instance = new Book();
		instance.setAuthorName(authorName);
	}

	/**
	 * Test of setSubject method, of class Book.
	 */
	@Test
	public void testSetSubject() {
		System.out.println("setSubject");
		Constants.Subject subject = null;
		Book instance = new Book();
		instance.setSubject(subject);
	}

	/**
	 * Test of getBookName method, of class Book.
	 */
	@Test
	public void testGetBookName() {
		System.out.println("getBookName");
		Book instance = new Book();
		
		instance.setBookName("Introductions to Algorithms");
		String expResult = "Introductions to Algorithms";
		String result = instance.getBookName();
		assertEquals(expResult, result);
		
		instance.setBookName("");
		expResult = "";
		result = instance.getBookName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getBookISBN method, of class Book.
	 */
	@Test
	public void testGetBookISBN() {
		System.out.println("getBookISBN");
		Book instance = new Book();
		
		instance.setBookISBN("1234567890");
		String expResult = "1234567890";
		String result = instance.getBookISBN();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getAuthorName method, of class Book.
	 */
	@Test
	public void testGetAuthorName() {
		System.out.println("getAuthorName");
		Book instance = new Book();
		String expResult = "";
		String result = instance.getAuthorName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getSubject method, of class Book.
	 */
	@Test
	public void testGetSubject() {
		System.out.println("getSubject");
		Book instance = new Book();
		Constants.Subject expResult = null;
		Constants.Subject result = instance.getSubject();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getStatus method, of class Book.
	 */
	@Test
	public void testGetStatus() {
		System.out.println("getStatus");
		Book instance = new Book();
		Constants.Status expResult = null;
		Constants.Status result = instance.getStatus();
		assertEquals(expResult, result);
	}

}
