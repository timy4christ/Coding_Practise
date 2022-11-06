import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class TicTacToe{
	
	static List<Integer> playerPositions = new ArrayList<>();
	static List<Integer> cpuPositions = new ArrayList<>();
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, 
						{'-', '+', '-', '+', '-'}, 
						{' ', '|', ' ', '|', ' '},
						{'-', '+', '-', '+', '-'},
						{' ', '|', ' ', '|', ' '}}; 
		
		System.out.println();
		printBoard(gameBoard);
		while(true){
			System.out.print("Enter your position (1-9) : ");
			int playerPos = sc.nextInt();
			while(true){
				if(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
					System.out.println("Place Taken!!");
					System.out.print("Enter your position (1-9) : ");
					playerPos = sc.nextInt();
				} else {
					setPiece(gameBoard, playerPos, "player");
					break;
				}
			}
			
			
			String res = checkWinner();
			if(!res.isEmpty()){
				printBoard(gameBoard);
				System.out.println(res);
				break;				
			}
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while(true){
				if(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){			
					cpuPos = rand.nextInt(9) + 1;
				} else {
					setPiece(gameBoard, cpuPos, "cpu");
					break;
				}
			}
			
			res = checkWinner();
			if(!res.isEmpty()){
				printBoard(gameBoard);
				System.out.println(res);
				break;				
			}
			
			printBoard(gameBoard);
		}
	}
	
	public static void printBoard(char[][] gameBoard){
		for(char[] row : gameBoard){
			for(char ele : row)
				System.out.print(ele);
			System.out.println();
		}
	}
	
	public static void setPiece(char[][] gameBoard, int pos, String user){
		
		char symbol = ' ';
		if(user.equals("player")){
			symbol = 'X';
			playerPositions.add(pos);
		} else if(user.equals("cpu")) {
			symbol = 'O';
			cpuPositions.add(pos);
		}
			
		
		switch(pos){
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;				
		}
	}
	
	public static String checkWinner(){
		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> botRow = Arrays.asList(7, 8, 9);
		List<Integer> leftCol = Arrays.asList(1, 4, 7);
		List<Integer> midCol = Arrays.asList(2, 5, 8);
		List<Integer> rightCol = Arrays.asList(3, 6, 9);
		List<Integer> diag1 = Arrays.asList(1, 5, 9);
		List<Integer> diag2 = Arrays.asList(3, 5, 7);
		
		List<List> winning = new ArrayList<>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(diag1);
		winning.add(diag2);
		
		for(List l : winning){
			if(playerPositions.containsAll(l)){
				return "Congratualtions, you won!!";
			} else if(cpuPositions.containsAll(l)){
				return "Sorry, CPU won :(";
			} else if(playerPositions.size() + cpuPositions.size() == 9){
				return "Its a Draw";
			}
		}
		return "";
			
	}
	
}