package youtubeMavenProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class appTest {

	@Test
	public void test() {
		app b=new app();
		int actual= b.add(4,5);
		int expected=9;
		assertEquals(expected,actual);
	}

}
