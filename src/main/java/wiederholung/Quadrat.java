package wiederholung;

public class Quadrat {

	public static void printQuadrat(int zeilen) {
		for (int row=0;row<zeilen;row++) {
			for (int col=0;col<zeilen;col++) {
				if (row>0 && col>0 && row<zeilen-1 && col<zeilen-1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printQuadrat(9);
	}
}
