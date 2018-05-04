package battleship;

import java.util.Scanner;

public class ProgramStart {
	public static void main(String args[]) {
		String[] sea =  {"D","x","x","x","s"};
		String[] sea1 = {"C","x","x","x","s"};
		String[] sea2 = {"B","s","s","x","s"};
		String[] sea3 = {"A","s","x","x","x"};
		String[] sea4 = {" ","1","2","3","4"};
		String[][] seas = {sea4, sea3, sea2, sea1, sea};
		for (int x = 0; x < seas.length; x++) {
			for(int y = 0; y< seas[x].length; y++) {
				System.out.print(seas[x][y]);
			}
			System.out.println("");
		}
		boolean toContinue = true;
		while(toContinue) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println(input);
			int column = getcolumn(input);
			int row = getrow(input);
			System.out.println("the column is: "+ column);
			System.out.println("The outcome is: " + sea[column]);
			System.out.println("the row is: "+ row);
			System.out.println("The total is: " + seas[row][column]);
		}
		
		
		
	}
	static int getcolumn(String input) {
		char theChar = input.charAt(1);
		int trial = theChar - 48;
		return trial;
	}
	static int getrow(String input) {
		char theChar = input.charAt(0);
		int trial = theChar - 96;
		return trial;
	}

}
