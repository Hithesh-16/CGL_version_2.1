/** 
 * @author Hithesh
 * @version 2.3
 */
package ConwaysGameOfLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 *It is to test the create board method
 *
 */
public class TestJunitCreateBoard {
	@Test
    public void BoardTest1() {
		int live[][] = {{1,2}}; 
		Board b = new Board();
		String str="";
		boolean [][] arr=b.createBoard(3,3, live);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				str+=arr[i][j];
			}
			if(i<arr.length-1) {
				str+="\n";
				
			}
		}
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("falsefalsefalse\n"
	    		+ "falsefalsetrue\n"
	    		+ "falsefalsefalse",str);

}
	/**
	 * TestCase2 for create board
	 */
	@Test
	public void BoardTest2() {
		int live[][] = {{1,3},{1,4},{2,4}}; 
		Board b = new Board();
		String str="";
		boolean [][] arr = b.createBoard(5,5, live);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				str+=arr[i][j];
			}
			if(i<arr.length-1) {
				str+="\n";
			}
		}
		
	    System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals("falsefalsefalsefalsefalse\n"
	    		+ "falsefalsefalsetruetrue\n"
	    		+ "falsefalsefalsefalsetrue\n"
	    		+ "falsefalsefalsefalsefalse\n"
	    		+ "falsefalsefalsefalsefalse",str);
	}
	}



