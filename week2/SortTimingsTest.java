
/**
 * Write a description of SortTimingsTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTimingsTest {
	private SortTimings st;

	@Before
	public void setUp() throws Exception {
		this.st = new SortTimings();
	}

	@After
	public void tearDown() throws Exception {
		this.st = null;
	}

	@Test
	public void test() {
		st.runner();
	}

}
