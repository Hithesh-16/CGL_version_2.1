/**
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next genration by use the if conditions
 * 
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * 
 * @author <Hithesh Reddy K and 2020501016> 
 * @version Version2.30
 * Took help from my Team Mate Ashish Mylavarapu. 
 */



package ConwaysGameOfLife;


public class Board {
	public boolean[][] createBoard(int n, int l[][]) {
        boolean [][] board = new boolean [n][n];
        for(int i=0;i<l.length;i++){
            int row= l[i][0];
            int col = l[i][1];
            board[row][col]=true;
        }
        return board;
    }
	
	
  /**
     * Check for the writeup on how to print the board.
     * @param board[][]
     * @param n
     * @return
     */
	
	
    public String printBoard(boolean board[][]) {
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    sb.append("*");
                }
                else{
                    sb.append(".");
                }
            }
            if(i<board.length-1) {
            	sb.append("\n");
            }
            
        }
        return sb.toString();
    }
    
    /**
     * To print the nextGeneration. 
     * @param present
     * @return
     */
    public boolean[][] generateNextGeneration(boolean present[][]) {
        int n= present.length;
        boolean[][] newBoard = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newBoard[i][j]=false;
                }
            }
            for(int i=0;i<n;i++) {
            	for(int j=0;j<n;j++) {
            		int cnt=0;
            		 int x = i -1;
                     int y = j-1;
                     if (x<0) {
                     	x = present.length-1;
                     }
                     if (y <0) {
                     	y =present.length-1;
                     }
                     if(present[x][y]==true){
                         cnt+=1;
                     }
                     if(present[x][j]==true){
                         cnt+=1;
                     }																
                     if(present[x][(j+1)%present.length]==true){
                         cnt+=1;
                     }
                     if(present[i][y]==true){
                         cnt+=1;
                     }
                     if(present[i][(j+1)%present.length]==true){
                         cnt+=1;
                     }
                     if(present[(i+1)%present.length][y]==true){
                         cnt+=1;
                     }
                     if(present[(i+1)%present.length][j]==true){
                         cnt+=1;
                     }
                     if(present[(i+1)%present.length][(i+1)%present.length]==true){
                         cnt+=1;
                     }
              

            		
            		if(present[i][j]==true) {
            			if(cnt==2||cnt==3) {
            				newBoard[i][j]=true;
            			}
            		}
            		else {
            			if(cnt==3) {
            				newBoard[i][j]=true;
            			}
            		}
            	
            	}
            }
            return newBoard;
    }
}


