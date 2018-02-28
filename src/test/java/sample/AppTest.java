package sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testMultiply() {
		App underTest = new App();
		int result = underTest.divide(20, 2);

		assertEquals(10, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIlligalDivide() {
		App underTest = new App();
		underTest.divide(5, 0);
	}
	
	@Test
	public void testAdd() 
	{
		App underTest = new App();
		int result = underTest.divide(100, 50);
		assertEquals(2, result);
	}
	@Test
	public void testSubstract() 
	{
		App underTest = new App();
		int result = underTest.divide(100, 50);
		assertEquals(2, result);
	}
}
