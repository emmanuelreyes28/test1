import java.util.Scanner;

public class playTicTacToe {
	//Main class 
	public static void main(String [] args) {
		ticTacToe game = new ticTacToe(); //new game of TicTacToe
		System.out.println("Welcome to Tic-Tac-Toe!");
		System.out.println("Input example: 2 2. Use integers only.");
		game.displayBoard();
		Scanner in = new Scanner(System.in);
		//Variables 
		int row;
		int col;
		
	
		while(true) {
			//If there are no more moves to make break out of the loop 
			if(game.isBoardFull()) {
				System.out.println("Draw.");
				break;
			}
			//if current player is X then asks for input 
			if(game.playerMove == 'X') {
				System.out.print("Enter row and column number: ");
				row = in.nextInt() - 1;
				col = in.nextInt() - 1;
				//if input is invalid prompt user for correct input 
				while(game.playersTurn(row, col) == false) {
					System.out.println("Invalid input.");
					in = new Scanner(System.in);
					System.out.print("Enter row and column number: ");
					row = in.nextInt() - 1;
					col = in.nextInt() - 1;

				}
				
		}
			else {
				//If current player is O then call cpuTurn 
				game.cpuTurn();
			}
			//Check board for winner 
			if(game.checkForWin()) {
				System.out.println(game.playerMove + " WINS!");
				break;
			}
			//Update current player 
			game.nextMove();


		
	}
		//Close scanner 
		in.close();

}}
