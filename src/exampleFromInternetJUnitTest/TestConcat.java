package exampleFromInternetJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcat {

	@Test
	public void testConcatenate() {
		JUnit test = new JUnit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
