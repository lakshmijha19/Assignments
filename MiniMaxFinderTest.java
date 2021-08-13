import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiniMaxFinderTest {

	@Test
	void Arraytest() {
		MiniMaxFinder mm = new MiniMaxFinder();
		int[] expected = new int[]{89,10};
		
		int[] actual = mm.findMiniMax(new int[] {40,45,89,21,10,79});
		assertArrayEquals(expected,actual);
		
	}

}