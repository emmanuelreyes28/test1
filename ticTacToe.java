
public class ticTacToe {
	//Class variables 
	private char[][] board;
	char playerMove;
	int moves;
	int cpuMoves;
	
	//Constructor
	public ticTacToe() {
		board = new char[3][3];
		setUpBoard();
		playerMove = 'X';
		moves = 0;
		cpuMoves = 0;
		
	}
	
	/**
	 * This method fills every element in the array with an empty space character 
	 */
	public void setUpBoard() {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				board[row][col] = ' ';
			}
		}
	}
	/**
	 * This method prints the board onto the console 
	 */
	public void displayBoard() {
		System.out.println();
		for(int row = 0; row < 3; row++) {
			//System.out.print("| ");
			for(int col = 0; col < 3; col++) {
				System.out.print(board[row][col]);
				if(col == 0 || col == 1) {
					System.out.print("   |");
				}
			}
			if(row == 0 || row == 1) {
				System.out.println();
				System.out.println("----+----+-----");
		}
	} System.out.println();}
	
	/**
	 * This method checks if the specified input is valid and return a boolean 
	 * @param row row number enter by human player 
	 * @param col column number entered by human player 
	 * @return boolean; true if input is valid, false otherwise 
	 */
	public boolean playersTurn(int row, int col) {
		if((row >= 0)&&(row<3)) {
			if((col>=0)&&(col<3)) {
				if(board[row][col] == ' ') {
					board[row][col] = playerMove;
					moves++;
					//playerMove = 'O';
					displayBoard();
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * This method controls the computers next move based on the human player's move
	 * Updates and displays board when move is made 
	 */
	public void cpuTurn() {
		System.out.println("CPU move.");
		if(moves < 2) {
			if(board[1][1] == 'X') {
				board[2][0] = 'O';
			}
			else if(board[1][1] == ' ') {
				board[1][1] = 'O';
				
			}
			else if(board[0][1] == ' ') {
				board[0][1] = 'O';
				
			}
			else if(board[1][0] == ' ') {
				board[1][0] = 'O';
				
			}
			else if(board[1][2] == ' ') {
				board[1][2] = 'O';
				
			}
			else if(board[2][1] == ' ') {
				board[2][1] = 'O';
			
			}
			else if(board[0][0] == ' ') {
				board[0][0] = 'O';
				
			}
			else if(board[0][2] == ' ') {
				board[0][2] = 'O';
				
			}
			else if(board[2][0] == ' ') {
				board[2][0] = 'O';
				
			}
			else if(board[2][1] == ' ') {
				board[2][1] = 'O';
				
			}
			
		}
		else if (cpuMoves >= 2 || moves >= 2) {
			//Playing offense on diagonals 
			if(board[0][0] == 'O' && board[1][1] == 'O' && checkPosition(2,2) == true) {
				board[2][2] = 'O';	
			}
			else if(board[1][1] == 'O' && board[2][2] == 'O' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
				
			}
			else if(board[0][0] == 'O' && board[2][2] == 'O' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
				
			}
			else if(board[2][0] == 'O' && board[1][1] == 'O' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
				
			}
			else if(board[1][1] == 'O' && board[0][2] == 'O' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
				
			}
			else if(board[2][0] == 'O' && board[0][2] == 'O' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
			 
			}
			//playing defense on diagonals 
			else if(board[0][0] == 'X' && board[1][1] == 'X' && checkPosition(2,2) == true) {
				board[2][2] = 'O';
			
			}
			else if(board[1][1] == 'X' && board[2][2] == 'X' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
			
			}
			else if(board[0][0] == 'X' && board[2][2] == 'X' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
			
			}
			else if(board[2][0] == 'X' && board[1][1] == 'X' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
			
			}
			else if(board[1][1] == 'X' && board[0][2] == 'X' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
				
			}
			else if(board[2][0] == 'X' && board[0][2] == 'X' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
				
			}
			//playing offense on rows 
			else if(board[0][0] == 'O' && board[0][1] == 'O' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
				
			}
			else if(board[0][1] == 'O' && board[0][2] == 'O' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
			
			}
			else if(board[0][0] == 'O' && board[0][2]== 'O' && checkPosition(0,1) == true) {
				board[0][1] = 'O';
			
			}
			else if (board[1][0] == 'O' && board[1][1] == 'O' && checkPosition(1,2) == true) {
				board[1][2] = 'O';
			
			}
			else if(board[1][1] == 'O' && board[1][2] == 'O' && checkPosition(1,0) == true) {
				board[1][0] = 'O';
			
			}
			else if(board[1][2] == 'O' && board[1][0] == 'O' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
			
			}
			else if (board[2][0] == 'O' && board[2][1] == 'O' && checkPosition(2,2) == true) {
				board[2][2] = 'O';
			
			}
			else if(board[2][1] == 'O' && board[2][2] == 'O' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
			
			}
			else if(board[2][2] == 'O' && board[2][0] == 'O' && checkPosition(2,1) == true) {
				board[2][1] = 'O';
			
			}
			//playing offense on columns 
			//column 0 
			else if(board[0][0] == 'O' && board[1][0] == 'O' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
			
			}
			else if(board[1][0] == 'O' && board[2][0] == 'O' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
			
			}
			else if(board[0][0] == 'O' && board[2][0]== 'O' && checkPosition(1,0) == true) {
				board[1][0] = 'O';
				
			}
			//column 1
			else if(board[0][1] == 'O' && board[1][1] == 'O' && checkPosition(2,1) == true) {
				board[2][1] = 'O';
			
			}
			else if(board[1][1] == 'O' && board[2][1] == 'O' && checkPosition(0,1) == true) {
				board[0][1] = 'O';
			
			}
			else if(board[0][1] == 'O' && board[2][1]== 'O' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
				
			}
			//column 2
			else if(board[0][2] == 'O' && board[1][2] == 'O' && checkPosition(2,2) == true) {
				board[2][2] = 'O';
			
			}
			else if(board[1][2] == 'O' && board[2][2] == 'O' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
				
			}
			else if(board[0][2] == 'O' && board[2][2]== 'O' && checkPosition(1,2) == true) {
				board[1][2] = 'O';
			
			}
			//playing defense on rows
			//row 0
			else if(board[0][0] == 'X' && board[0][1] == 'X' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
			
			}
			else if(board[0][1] == 'X' && board[0][2] == 'X' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
				
			}
			else if(board[0][0] == 'X' && board[0][2]== 'X' && checkPosition(0,1) == true) {
				board[0][1] = 'O';
				
			}
			//row 1
			else if (board[1][0] == 'X' && board[1][1] == 'X' && checkPosition(1,2) == true) {
				board[1][2] = 'O';
				
			}
			else if(board[1][1] == 'X' && board[1][2] == 'X' && checkPosition(1,0) == true) {
				board[1][0] = 'O';
				
			}
			else if(board[1][2] == 'X' && board[1][0] == 'X' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
				
			}
			//row 2
			else if (board[2][0] == 'X' && board[2][1] == 'X' && checkPosition(2,2) == true) {
				board[2][2] = 'O';
			
			}
			else if(board[2][1] == 'X' && board[2][2] == 'X' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
			
			}
			else if(board[2][2] == 'X' && board[2][0] == 'X' && checkPosition(2,1) == true) {
				board[2][1] = 'O';
				
			}
			//playing defense on columns 
			//column 0 
			else if(board[0][0] == 'X' && board[1][0] == 'X' && checkPosition(2,0) == true) {
				board[2][0] = 'O';
				
			}
			else if(board[1][0] == 'X' && board[2][0] == 'X' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
				
			}
			else if(board[0][0] == 'X' && board[2][0]== 'X' && checkPosition(1,0) == true) {
				board[1][0] = 'O';
			
			}
			//column 1
			else if(board[0][1] == 'X' && board[1][1] == 'X' && checkPosition(2,1) == true) {
				board[2][1] = 'O';
			
			}
			else if(board[1][1] == 'X' && board[2][1] == 'X' && checkPosition(0,1) == true) {
				board[0][1] = 'O';
		
			}
			else if(board[0][1] == 'X' && board[2][1]== 'X' && checkPosition(1,1) == true) {
				board[1][1] = 'O';
			
			}
			//column 2
			else if(board[0][2] == 'X' && board[1][2] == 'X' && checkPosition(2,2) == true) {
				board[2][2] = 'O';
			
			}
			else if(board[1][2] == 'X' && board[2][2] == 'X' && checkPosition(0,2) == true) {
				board[0][2] = 'O';
		
			}
			else if(board[0][2] == 'X' && board[2][2]== 'X' && checkPosition(1,2) == true) {
				board[1][2] = 'O';
			
			}
			
			//Catch trap
			else if(board[1][1] == 'X' && board[0][2] == 'X' && checkPosition(0,0) == true) {
				board[0][0] = 'O';
			
			}
			else if(board[0][1] == 'X' && board[1][2] == 'X' && checkPosition(0,2)) {
				board[0][2] = 'O';
				
			}
			else if(board[0][1] == 'X' && board[1][0] == 'X' && checkPosition(0,0)) {
				board[0][0] = 'O';
			
			}
			else if(board[1][0] == 'X' && board[2][1] == 'X' && checkPosition(2,0)) {
				board[2][0] = 'O';
				
			}
			else if(board[1][2] == 'X' && board[2][1] == 'X' && checkPosition(2,2)) {
				board[2][2] = 'O';
				
			} 

		//Look for empty space in board and fill it in 
		else{
			if(board[1][1] == ' ') {
				board[1][1] = 'O';
			
			}
			else if(board[0][1] == ' ') {
				board[0][1] = 'O';
			
			}
			else if(board[1][0] == ' ') {
				board[1][0] = 'O';
		
			}
			else if(board[1][2] == ' ') {
				board[1][2] = 'O';
			
			}
			else if(board[2][1] == ' ') {
				board[2][1] = 'O';
			
			}
			else if(board[0][0] == ' ') {
				board[0][0] = 'O';
			
			}
			else if(board[0][2] == ' ') {
				board[0][2] = 'O';
			
			}
			else if(board[2][0] == ' ') {
				board[2][0] = 'O';
			
			}
			else if(board[2][1] == ' ') {
				board[2][1] = 'O';
		
			}
			else {
				if(board[2][2] == ' ') {
					board[2][2] = 'O';
				
				}
			}
		
		}}
		//Update cpuMoves and game board 
		cpuMoves++;
		displayBoard();
		}
		
		
	
		
	
	
	/**
	 * This method checks if the board is full and returns a boolean 
	 * @return true if board is full, false otherwise 
	 */
	public boolean isBoardFull() {
		boolean isFull = true;
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				if(board[row][col] == ' ') {
					isFull = false;
				}
			}
		}
		return isFull;
	}
	/**
	 * This method checks if values are equal to each other 
	 * Used to check for winner  
	 * @param a player X or O 
	 * @param b player X or O
	 * @param c player X or O 
	 * @return true if all values are the same, false otherwise 
	 */
	private boolean areValuesTheSame(char a, char b, char c) {
		return((a != ' ') && (a == b) && (b == c));
	}
	
	/**
	 * This method checks every row in board for winner and returns boolean 
	 * @return true if all values are the same, false otherwise 
	 */
	private boolean checkRows() {
		for(int row = 0; row < 3; row++) {
			if(areValuesTheSame(board[row][0], board[row][1], board[row][2]) == true){
				return true;
			}
		} return false;
	}
	
	/**
	 * This method checks every column if there is a winner and returns a boolean 
	 * @return true if all values are the same, false otherwise 
	 */
	private boolean checkColumns() {
		for(int col = 0; col < 3; col++) {
			if(areValuesTheSame(board[0][col], board[1][col], board[2][col]) == true) {
				return true;
			}
		} return false;
	}
	
	/**
	 * This method checks both diagonals if there is a winner and returns a boolean 
	 * @return true if all values are the same, false otherwise 
	 */
	private boolean checkDiagonals() {
		return((areValuesTheSame(board[0][2], board[1][1], board[2][0]) == true) ||
				(areValuesTheSame(board[0][0], board[1][1], board[2][2]) == true));
	}
	
	/**
	 * This method checks if there is a winner in any of the methods above 
	 * @return true if there is a winner, false otherwise 
	 */
	public boolean checkForWin() {
		boolean bool = (checkDiagonals()||checkColumns()||checkRows());
		return bool;
	}
	
	/**
	 * This method is used to check if a specified coordinate is empty/available 
	 * @param r row number 
	 * @param c column number 
	 * @return true if position is empty, false otherwise 
	 */
	public boolean checkPosition(int r, int c) {
		return(board[r][c] == ' '); //returns true if position is empty 	
	}
	
	/**
	 * This method updates player moves 
	 */
	public void nextMove() {
		if(playerMove == 'X') {
			playerMove = 'O';
		}
		else {
			playerMove = 'X';
		}
	}
	
	
		
		
		
	
	
	

}
