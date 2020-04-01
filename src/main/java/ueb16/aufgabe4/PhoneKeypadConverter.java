package ueb16.aufgabe4;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;
import myExceptions.IllegalPhoneNumberException;

public class PhoneKeypadConverter {

	private Map<String, String> map;
	private String digit = "";

	public PhoneKeypadConverter() {
		map = new HashMap<>();
		for (char c = 'a'; c <= 'z'; c++) {
			switch (Character.toUpperCase(c)) {
				case 'A':
				case 'B':
				case 'C':
					digit = "2";
					break;
				case 'D':
				case 'E':
				case 'F':
					digit = "3";
					break;
				case 'G':
				case 'H':
				case 'I':
					digit = "4";
					break;
				case 'J':
				case 'K':
				case 'L':
					digit = "5";
					break;
				case 'M':
				case 'N':
				case 'O':
					digit = "6";
					break;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					digit = "7";
					break;
				case 'T':
				case 'U':
				case 'V':
					digit = "8";
					break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					digit = "9";
					break;
			}
			map.put(Character.toString(c).toUpperCase(), digit);
		}
	}

	public String convert(String line) throws IllegalPhoneNumberException {
		String out = "";
		for (int i = 0; i < line.length(); i++) {
			if (!map.containsKey(Character.toString(line.charAt(i)).toUpperCase())) {
				throw new IllegalPhoneNumberException("Invalid Phone Number!");
			}
			out += map.get(Character.toString(line.charAt(i)).toUpperCase());
		}
		return out;
	}

	public void readFileAndWriteToFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\ueb16\\aufgabe4\\Zeichenkontakte.txt"));
			 BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\java\\ueb16\\aufgabe4\\Nummernkontakte.txt"))) {

			String line = "";
			while ((line = br.readLine()) != null) {
				try {
					bw.write(convert(line));
					bw.newLine();
					bw.flush();
				} catch (IllegalPhoneNumberException e) {
					continue;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PhoneKeypadConverter sms = new PhoneKeypadConverter();
		sms.readFileAndWriteToFile();
	}
}