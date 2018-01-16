
/**
 * Write a description of QuakeSortInPlaceTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuakeSortInPlaceTest {
	private QuakeSortInPlace qs;
	
	@Before
	public void setUp() throws Exception {
		this.qs = new QuakeSortInPlace();
	}

	@After
	public void tearDown() throws Exception {
		this.qs = null;
	}

	@Test
	public void test() {
		qs.testSort();
	}

}
