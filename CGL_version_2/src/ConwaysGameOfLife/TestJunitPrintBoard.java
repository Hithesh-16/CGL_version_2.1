/** 
 * @author Hithesh
 * @version 2.1
 */
package ConwaysGameOfLife;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 * To test the PrintBoard
 *
 */
public class TestJunitPrintBoard {
	@Test
	public void printBoardtest1() {
		boolean present [] []= {{false,false, true, false},{false,true,false,true},{false,true,true,false},{false, true, true, false}};
		Board b= new Board();
		String str= b.printBoard(present);
		String expected="..*.\n"
				+ ".*.*\n"
				+ ".**.\n"
				+ ".**.";
		Assertions.assertEquals(expected, str);
		
	
	}

}
