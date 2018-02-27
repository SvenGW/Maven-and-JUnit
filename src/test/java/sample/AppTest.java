package sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testMultiply() {
		App underTest = new App();
		int result = underTest.multiply(2, 5);

		assertEquals(10, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIlligalMultiply() {
		App underTest = new App();
		underTest.multiply(0, 5);
	}
}
