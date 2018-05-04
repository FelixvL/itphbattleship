package battleship;

import java.util.Scanner;

public class ProgramStart {
	public static void main(String args[]) {
		String[] sea =  {"D","x","x","x","s"};
		String[] sea1 = {"C","x","x","x","s"};
		String[] sea2 = {"B","s","s","x","s"};
		String[] sea3 = {"A","x","x","x","x"};
		String[] sea4 = {" ","1","2","3","4"};
		String[][] seas = {sea, sea1, sea2, sea3, sea4};
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
		}
		
		
	}

}
