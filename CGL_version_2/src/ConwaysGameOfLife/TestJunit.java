/**
 * @author Hithesh<2020501016>
 * This is for handling all the test cases for every corner.
 */


package ConwaysGameOfLife;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	/**
	 * TestStart One For the test cases
	 */
	@Test
	public void testStartOne() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{2,2},{3,3}};
		int shift =1;
		int gen =1;
		ConwaysGameOfLife con = new ConwaysGameOfLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing =".....\n"
				+ ".*...\n"
				+ "..*..\n"
				+ "...*.\n"
				+ ".....";
		Assertions.assertEquals(testing,newPrint);
		/**
		 * TestStart two to test another test case
		 */
	}
	@Test
	public void testStartTwo() { 
		String str = "end";
		int n = 5;
		int [][] livecells = {{1,1},{2,1},{3,1}};
		int shift =1;
		int gen =1;
		ConwaysGameOfLife con = new ConwaysGameOfLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing ="";
		Assertions.assertEquals(testing,newPrint);
	}
	/**
	 * Testcase three is to handle the corner tests
	 */
	@Test
	public void testStartThree() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
		int shift =1;
		int gen =2;
		ConwaysGameOfLife con = new ConwaysGameOfLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing =".....\n"
				+ "...**\n"
				+ ".....\n"
				+ "...*.\n"
				+ ".....";
		Assertions.assertEquals(testing,newPrint);
	}
	/**
	 * Testcase four is to handle the corner tests
	 */
	@Test
	public void testStartFour() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
		int shift =2;
		int gen =2;
		ConwaysGameOfLife con = new ConwaysGameOfLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing =".....\n"
				+ ".....\n"
				+ ".....\n"
				+ ".....\n"
				+ ".....";
		Assertions.assertEquals(testing,newPrint);
	}
	/**
	 * Testcase five is to handle the corner tests
	 */
	@Test
	public void testStartFive() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
		int shift =1;
		int gen =5;
		ConwaysGameOfLife con = new ConwaysGameOfLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing =".....\n"
				+ ".....\n"
				+ ".....\n"
				+ ".....\n"
				+ ".....";
		Assertions.assertEquals(testing,newPrint);
	}




}
