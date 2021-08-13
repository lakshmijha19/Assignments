import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("testing mathutils class")
class MathUtilityTest {
	
	MathUtility mu;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeAll
	static void Beforeinit() {
		
		System.out.println("this should run before all method");
	}
	
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
	  mu = new MathUtility();
	  testReporter.publishEntry("Running " + testInfo.getDisplayName() + "with " + testInfo.getTags());
	}
	
	@AfterEach
	void clean() {
		System.out.println("Cleaning up....");
	}
	
	@Nested
	class AddTest{
		@DisplayName("Testing add method for positive")
		@Test
		void testAddpos() {
			int expected = 2;
			int actual = mu.add(1, 1);
			assertEquals(expected, actual, ()-> "This method should add two numbers");
		}
		
		@DisplayName("Testing add method for negative")
		@Test
		void testAddneg() {
			int expected = -2;
			int actual = mu.add(-1, -1);
			assertEquals(expected, actual, "This method should add two numbers"); //  this will give a  message to user
		}
	}
	
	@DisplayName("Testing add method")
	@Test
	void testAdd() {
		int expected = 2;
		int actual = mu.add(1, 1);
		assertEquals(expected, actual, "This method should add two numbers"); //  this will give a  message to user
	}
	
	@Test
	@DisplayName("tesind testArea")
	@Tag("Math")
	void TestArea() {
		assertEquals(314.0, mu.ComputeCircleArea(10), "Area should be calculated");
	}
	
	@Test
	@EnabledOnOs(OS.LINUX)
	void TestDivide() {
		assertThrows(ArithmeticException.class, ()-> mu.divide(1,0), "arithmetic exception will throw");
	}
	
	//@Test
	@RepeatedTest(3)
	@Tag("Math")
	@DisplayName("multiply")
	void testMul() {
		
		assertAll(
			() -> assertEquals(4, mu.multiply(2, 2)),
			() -> assertEquals(-2, mu.multiply(-2, 1)),
			() -> assertEquals(10, mu.multiply(2, 5))
				
				);
	}
	@Test
	@Disabled
	@DisplayName("A disable method")
	void disable() {
		fail("This should not run");
	}
	
	
}