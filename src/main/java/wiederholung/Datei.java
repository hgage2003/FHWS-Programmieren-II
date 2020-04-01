package wiederholung;
import java.util.Scanner;

public class Datei {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie einen Dateinamen ein: ");
		String input = scanner.nextLine();
		
		System.out.println("Geben Sie eine Dateiendung ein: ");
		String extension = scanner.nextLine();

		int index = input.indexOf(".");
		System.out.println(index);
		
		if (index != -1) {
			String output = input.substring(0,index); //beginnt bei erste Stelle, hört bei Index auf
			output = output + "." + extension; //neuer String
			System.out.println(output);
		}
		
		scanner.close();
	}

}
