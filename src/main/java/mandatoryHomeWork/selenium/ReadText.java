package mandatoryHomeWork.selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\SDET\\src\\main\\java\\mandatoryHomeWork\\selenium\\Text.txt");
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\\.\\s*");

		while (scanner.hasNext()) {
			System.out.println(scanner.next());

		}
		scanner.close();
	}
}



//FileReader fr = new FileReader("F:\\SDET\\src\\main\\java\\mandatoryHomeWork\\selenium\\Text.txt");
//		BufferedReader b = new BufferedReader(fr);
//		String line;
//		while((line = b.readLine()) != null) {
//			System.out.println(line);
//		}