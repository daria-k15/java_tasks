import java.util.Scanner;

public class Battleship{
	public static void main(String[] args){
		Scanner vvod = new Scanner(System.in);
		char[][] player1 = new char [5][5];
		char[][] player2 = new char [5][5];
		char [][] firstField = new char[5][5];
		char [][] secondField = new char [5][5];
		arrayInit(player1);
		arrayInit(player2);
		players_init(player1, 1);
		players_init(player2, 2);
		arrayInit(firstField);
		arrayInit(secondField);
		int count = 1;
		while ((charSearch(player1, '@') == 1) && (charSearch(player2, '@') == 1))
		{ 
			if (count % 2 == 0){
				if (attack(player1, firstField, 2) != 0)
					count++;
			}else {
				if (attack(player2, secondField, 1) != 0)
					count++;
			}
		}
		if (charSearch(player1, '@') == 0)
			System.out.printf("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
		else if (charSearch(player2, '@') == 0)
			System.out.printf("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
		System.out.printf("\nFinal boards: \n");
		printBattleShip(player1);
		printBattleShip(player2);
	}

	private static int attack(char[][] player, char[][] field, int ind)
	{
		Scanner vvod = new Scanner(System.in);
		System.out.printf("Player %d, enter hit row/column:\n", ind);
		String[] current = vvod.nextLine().split(" ");
		int row = Integer.parseInt(current[0]);
		int col = Integer.parseInt(current[1]);
		if (row < 0 || row >= 5 || col < 0 || col >= 5){
			System.out.printf("Invalid coordinates. Choose different coordinates.\n");
			return(0);
		} else if (player[row][col] == '@'){
			if (ind == 1)
				System.out.printf("PLAYER 1 HIT PLAYER 2’s SHIP!\n");
			else
				System.out.printf("PLAYER 2 HIT PLAYER 1’s SHIP!\n");
			field[row][col] = 'X';
			player[row][col] = 'X';
			printBattleShip(field);
			return(1);
		} else if (field[row][col] == 'O'){
			System.out.printf("You already fired on this spot. Choose different coordinates.\n");
			return(0);
		}else {
			System.out.printf("PLAYER %d MISSED!\n", ind);
			field[row][col] = 'O';
			player[row][col] = 'O';
			printBattleShip(field);
			return(1);
		}
	}

	private static void arrayInit(char [][] player)
	{
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				player[i][j] = '-';
			}
		}
	}

	private static void printBattleShip(char[][]player)
	{
		System.out.print("  ");
		for (int i = -1; i < 5; i++){
			if (i > -1){
				System.out.print(i + " ");
			}
			for (int j = 0; j < 5; j++){
				if (i == -1){
					System.out.print(j + " ");
				} else {
					System.out.print(player[i][j] + " ");
				}
			}
				System.out.println();
		}
		System.out.println();
	}
	private static int charSearch(char[][] player, char ch){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				if (player[i][j] == '@')
					return (1);
			}
		}
		return (0);
	}
	private static void players_init(char[][] player, int num)
	{
		Scanner vvod = new Scanner(System.in);
		if (num == 1)
		System.out.printf("Welcome to Battleship!\n");
		System.out.println();
		System.out.printf("PLAYER %d, ENTER YOUR SHIPS' COORDINATES\n", num);
		for (int i = 1; i < 6; i++){
			System.out.printf("Enter ship %d location:\n", i);
			String[] current = vvod.nextLine().split(" ");
			int row = Integer.parseInt(current[0]);
			int col = Integer.parseInt(current[1]);
			if (row < 0 || row >= 5 || col < 0 || col >= 5){
				System.out.printf("Invalid coordinates. Choose different coordinates.\n");
				i--;
			}
			else if (player[row][col] == '@'){
				System.out.printf("You already have a ship there. Choose different coordinates.\n");
				i--;
			}
			else 
				player[row][col] = '@';
		}
		printBattleShip(player);
		for (int i = 0; i < 100; i++)
			System.out.println();
}
}