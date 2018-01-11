
/**
 * Write a description of MarkovRunnerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Generating Random Text
 * Assignment 1: MarkovZero and MarkovOne
 * Assignment 2: MarkovFour and MarkovModel
 * 
 * @author Kuei
 * @version July 11, 2016
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MarkovRunnerTest {
	private MarkovRunner mr;

	@Before
	public void setUp() throws Exception {
		mr = new MarkovRunner();
	}

	@After
	public void tearDown() throws Exception {
		mr = null;
	}

	@Test
	public void runMarkovZeroTest() {
		mr.runMarkovZero();
	}
	
	@Test
	public void runMarkovOneTest() {
		mr.runMarkovOne();
	}
	
	@Test
	public void runMarkovFourTest() {
		mr.runMarkovFour();
	}
	
	@Test
	public void runMarkovModelTest() {
		mr.runMarkovModel();
	}
	
	@Test
	public void testGetFollowsTest() {
		PrintStream original = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		mr.testGetFollows();
		assertEquals("[yes]\n[just, a]\n", outContent.toString());
		System.setOut(original);
	}
	
	@Test
	public void runMarkovTest() {
		mr.runMarkov();
	}
	
	
	@Test
	public void testGetFollowsTwoTest() {
		PrintStream original = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		mr.testGetFollowsTwo();
		assertEquals("[just, a]\n[test]\n", outContent.toString());
		System.setOut(original);
	}
	
	@Test
	public void runMarkovTwoTest() {
		mr.runMarkovTwo();
	}
	
	@Test
	public void runMarkovWordTest() {
		mr.runMarkovWord();
	}
	
	@Test
	public void testHashMapTest() {
		mr.testHashMap();
	}
	
	@Test
	public void compareMethodsTest(){
		mr.compareMethods();
	}
	
}
