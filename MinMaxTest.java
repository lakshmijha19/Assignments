import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MinMaxTest {

	@Test
	void testMin() {
		MinMax m = new MinMax();
		int expected = 10;
		int actual = m.getMin(new int[] {40,45,89,21,10,79});
	assertEquals(expected,actual);
	}
	
	@Test
	void testMax() {
		MinMax m = new MinMax();
		int expected = 89;
	int actual = m.getMax(new int[] {40,45,89,21,10,79});
	assertEquals(expected,actual);
		
	}
	

}