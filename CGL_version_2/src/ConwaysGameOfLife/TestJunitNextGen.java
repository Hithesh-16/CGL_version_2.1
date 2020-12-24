/** 
 * @author Hithesh
 * @version 2.1
 * This class is to test the GenerateNextGen method in board class
 */
package ConwaysGameOfLife;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitNextGen {
	/**
	 * Test1 to test the next generation.
	 */
	@Test
	public void nextGenTest1() {
		boolean [][] present = {{false,false, true, false},{false,true,false,true},{false,true,true,false},{false, true, true, false}};
		Board b= new Board();
		System.out.println(present.length);
		boolean [] [] arr= b.generateNextGeneration(present);
		String str="";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				str+=arr[i][j];
				if(j<arr.length-1) {
					str+="_";
				}
			}
			if(i<arr.length-1) {
				str+="\n";
			}
		}
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("true_false_false_false\n"
	    		+ "true_true_false_true\n"
	    		+ "true_true_false_true\n"
	    		+ "false_true_false_true",str);
	}

}
