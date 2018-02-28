package sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testDivide() {
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
	public void testMultiply() 
	{
		App underTest = new App();
		int result = underTest.multiply(10, 40);
		assertEquals(400, result);
	}
	@Test
	public void testAdd() 
	{
		App underTest = new App();
		int result = underTest.add(100, 50);
		assertEquals(150, result);
	}
		
	@Test
	public void testSubtract() 
	{
		App underTest = new App();
		int result = underTest.subtract(15, 7);
		assertEquals(8, result);
	}
}
