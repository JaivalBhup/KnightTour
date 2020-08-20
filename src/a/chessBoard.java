package a;

import java.io.Serializable;
import java.util.ArrayList;
// this is a bean
public class chessBoard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private knight k;
	private int x=7;
	private int y=7;
	private int accessNum;
	private int[][] chessBoard1 = new int[8][8];
	private int[][][] chessBoard2 = new int[8][8][2];
	private int theLastNum;
	
	public chessBoard(knight k,int[][] chessBoard) {
		this.k = k;
		this.chessBoard1 = chessBoard;
	}
	public chessBoard(knight k,int[][][] chessBoard) {
		this.k = k;
		this.chessBoard2 = chessBoard;
	}
	
	public int theKnightMove(knight k,int[][] chessBoard) {
		ArrayList<Integer> movesAvailable = new ArrayList<>();
		int x = k.getX();
		int y = k.getY();
        if (x + 2 <= 7 && y + 1 <= 7) {
            movesAvailable.add(0);
            if (chessBoard[x+2][y+1] >= 1) {
                movesAvailable.remove(Integer.valueOf(0));

            }
        }
        if (x + 2 <= 7 && y - 1 >= 0) {
            movesAvailable.add(1);
            if (chessBoard[x+2][y-1] >= 1) {
                movesAvailable.remove(Integer.valueOf(1));

            }
        }
        if (x + 1 <= 7 && y - 2 >= 0) {
            movesAvailable.add(2);
            if (chessBoard[x+1][y-2] >= 1) {
                movesAvailable.remove(Integer.valueOf(2));

            }
        }
        if (x - 1 >= 0 && y - 2 >= 0) {
            movesAvailable.add(3);
            if (chessBoard[x-1][y-2] >= 1) {
                movesAvailable.remove(Integer.valueOf(3));

            }
        }
        if (x - 2 >= 0 && y + 1 <= 7) {
            movesAvailable.add(4);
            if (chessBoard[x-2][y+1] >= 1) {
                movesAvailable.remove(Integer.valueOf(4));

            }
        }
        if (x - 2 >= 0 && y - 1 >= 0) {
            movesAvailable.add(5);
            if (chessBoard[x-2][y-1] >= 1) {
                movesAvailable.remove(Integer.valueOf(5));

            }
        }
        if (x - 1 >= 0 && y + 2 <= 7) {
            movesAvailable.add(6);
            if (chessBoard[x-1][y+2] >= 1) {
                movesAvailable.remove(Integer.valueOf(6));

            }
        }
        if (x +1 <= 7 && y + 2 <= 7) {
            movesAvailable.add(7);
            if (chessBoard[x+1][y+2] >= 1) {
                movesAvailable.remove(Integer.valueOf(7));

            }
        }
        if(movesAvailable.size()==0){
            throw new IndexOutOfBoundsException();
        }
        int ran = (int) (Math.random() * movesAvailable.size());
        return movesAvailable.get(ran);
	}
	public int theKnightSmartlyMoves(knight k,int[][][] chessBoard) {
		int x = k.getX();
		int y = k.getY();
        ArrayList<Integer> movesAvailable = new ArrayList<>();
        int lowest = 8;
        int theMove = 0;

        if (x + 2 <= 7 && y + 1 <= 7) {
            movesAvailable.add(0);
            if (chessBoard[x+2][y+1][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(0));
            }
            else{
                int num = k.getAccesibleNumber(x+2,y+1);
                chessBoard[x+2][y+1][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(0));
                }

            }
        }
        if (x + 2 <= 7 && y - 1 >= 0) {
            movesAvailable.add(1);
            if (chessBoard[x+2][y-1][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(1));

            }
            else{
                int num = k.getAccesibleNumber(x+2,y-1);
                chessBoard[x+2][y-1][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(1));
                }

            }
        }
        if (x + 1 <= 7 && y - 2 >= 0) {
            movesAvailable.add(2);
            if (chessBoard[x+1][y-2][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(2));

            }
            else{
              
                int num = k.getAccesibleNumber(x+1,y-2);
                chessBoard[x+1][y-2][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(2));
                }

            }
        }
        if (x - 1 >= 0 && y - 2 >= 0) {
            movesAvailable.add(3);
            if (chessBoard[x-1][y-2][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(3));

            }
            else{
              
                int num = k.getAccesibleNumber(x-1,y-2);
                chessBoard[x-1][y-2][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(3));
                }

            }
        }
        if (x - 2 >= 0 && y + 1 <= 7) {
            movesAvailable.add(4);
            if (chessBoard[x-2][y+1][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(4));

            }
            else{
               
                int num = k.getAccesibleNumber(x-2,y+1);
                chessBoard[x-2][y+1][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(4));
                }

            }
        }
        if (x - 2 >= 0 && y - 1 >= 0) {
            movesAvailable.add(5);
            if (chessBoard[x-2][y-1][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(5));

            }
            else{
                
                int num = k.getAccesibleNumber(x-2,y-1);
                chessBoard[x-2][y-1][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(5));
                }

            }
        }
        if (x - 1 >= 0 && y + 2 <= 7) {
            movesAvailable.add(6);
            if (chessBoard[x-1][y+2][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(6));

            }
            else{
              
                int num = k.getAccesibleNumber(x-1,y+2);
                chessBoard[x-1][y+2][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(6));
                }
            }
        }
        if (x +1 <= 7 && y + 2 <= 7) {
            movesAvailable.add(7);
            if (chessBoard[x+1][y+2][0] >= 1) {
                movesAvailable.remove(Integer.valueOf(7));

            }
            else{
                
                int num = k.getAccesibleNumber(x+1,y+2);
                chessBoard[x+1][y+2][1]= num;
                if(lowest >= num){
                    lowest = num;
                    theMove = movesAvailable.get(movesAvailable.indexOf(7));
                }

            }
        }
        if(movesAvailable.size()==0){
            throw new IndexOutOfBoundsException();
        }
        return theMove;
    }
	public void makeKnightMove(int getMove) {
		int x = k.getX();
		int y = k.getY();
		 if(getMove==0){
	            x = x  + 2;
	            y =  y + 1;
	        }
	        else if(getMove==1){
	            x = x  + 2;
	            y =  y - 1;
	        }
	        else if(getMove==2){
	            x = x  + 1;
	            y =  y - 2;
	        }
	        else if(getMove==3){
	            x = x  - 1;
	            y =  y - 2;
	        }
	        else if(getMove==4){
	            x = x  - 2;
	            y =  y + 1;
	        }
	        else if(getMove==5){
	            x = x  - 2;
	            y =  y - 1;
	        }
	        else if(getMove==6){
	            x = x  - 1;
	            y =  y + 2;
	        }
	        else if(getMove==7){
	            x = x  + 1;
	            y =  y + 2;
	        }
		 k.setX(x);
		 k.setY(y);
		 }
	
	public void NonIntelligentMethod() {
      int count = 1;
      while(true){
          try {
              int myMove = theKnightMove(k,chessBoard1);
              makeKnightMove(myMove);
              chessBoard1[k.getX()][k.getY()]=count;
          }
          catch (IndexOutOfBoundsException e){
              break;
          }
          count ++;
      }
      this.theLastNum = count;
      


  }
	public void IntelligentMethod(){
        int count = 1;
        while(true){
            try {
                int myMove = theKnightSmartlyMoves(k,chessBoard2);
                makeKnightMove(myMove);
                chessBoard2[k.getX()][k.getY()][0]=count;
                
                count ++;
            }
            catch (IndexOutOfBoundsException e){
             
                break;
            }
            System.out.println(" ");
            System.out.println(" ");
        }
        this.theLastNum = count;
	}
	
	
////////Getters and setters/////////
	public int getLastNum() {
		return theLastNum;
	}
	public knight getK() {
		return k;
	}
	public void setK(knight k) {
		this.k = k;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAccessNum() {
		return accessNum;
	}
	public void setAccessNum(int accessNum) {
		this.accessNum = accessNum;
	}
	public int[][] getChessBoard1() {
		return chessBoard1;
	}
	public void setChessBoard1(int[][] chessBoard1) {
		this.chessBoard1 = chessBoard1;
	}
	public int[][][] getChessBoard2() {
		return chessBoard2;
	}
	public void setChessBoard2(int[][][] chessBoard2) {
		this.chessBoard2 = chessBoard2;
	}
	////////Getters and setters/////////
}
