/**
 * @author Hithesh Reddy K
 * version 2.3
 * Took help from my Team Mate Ashish.
 */
package ConwaysGameOfLife;

public class ConwaysGameOfLife {
	/**
	 * To start the Game.
	 * @param input
	 * @param n
	 * @param livecells
	 * @param shift
	 * @param generation
	 * @return
	 */

	public String start(String input, int n, int[][] livecells, int shift, int generation) {
		boolean condition;
		if (input.equals("start")) {
			condition = true;
		} else {
			condition = false;
		}
		if (condition) {
			Board obj = new Board();
			switch (shift) {
			case 1: {
				boolean[][] nextGen = null;
				boolean[][] currentGen = null;
				for (int i = 0; i < generation; i++) {
					if (i == 0) {
						currentGen = obj.createBoard(n, livecells);

					} else {
						nextGen = obj.generateNextGeneration(currentGen);
						if (obj.printBoard(currentGen).equals(obj.printBoard(nextGen))) {
							break;
						}
						currentGen = nextGen;
					}

				}
				return obj.printBoard(currentGen);

			}
			case 2: {

				boolean[][] nextGen = null;
				boolean[][] currentGen = null;
				for (int i = 0;; i++) {
					if (i == 0) {
						currentGen = obj.createBoard(n, livecells);

					} else {
						nextGen = obj.generateNextGeneration(currentGen);
						if (obj.printBoard(currentGen).equals(obj.printBoard(nextGen))) {
//								System.out.print(i);
							break;
						}
						currentGen = nextGen;
					}

				}
				return obj.printBoard(currentGen);

			}

			}

		}
		return "";
	}

}
