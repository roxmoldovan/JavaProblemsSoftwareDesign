
/**
 * Write a description of TesterTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesterTest {
	private Tester t;

	@Before
	public void setUp() throws Exception {
		t = new Tester();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void GetFollowstest() {
		t.testGetFollows();
	}
	
	@Test
	public void GetFollowsWithFileTest() {
		t.testGetFollowsWithFile();
	}

}