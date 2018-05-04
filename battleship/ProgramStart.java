package battleship;

public class ProgramStart {
	public static void main(String args[]) {
		String[] sea =  {"x","x","x","s"};
		String[] sea1 = {"x","x","x","s"};
		String[] sea2 = {"x","x","x","s"};
		String[] sea3 = {"x","x","x","x"};
		String[][] seas = {sea, sea1, sea2, sea3};
		for (int x = 0; x < seas.length; x++) {
			for(int y = 0; y< seas[x].length; y++) {
				System.out.print(seas[x][y]);
			}
			System.out.println("");
		}
	}

}
