package additionExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionExampleText {

	@Test
	public void testAdd() {
		Addition add = new Addition();
		int expectedResult = 4;
		int actualResult = add.add(2, 2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testAdd1() {
		Addition add = new Addition();
		int expectedResult = 10;
		int actualResult = add.add(3, 7);
		assertEquals(expectedResult, actualResult);
	}
}
