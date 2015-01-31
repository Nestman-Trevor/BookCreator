package exampleFromInternetJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void testMult() {
		JUnit test = new JUnit();
		int result = test.multiply(5, 5);
		assertEquals(24, result);
	}

}
