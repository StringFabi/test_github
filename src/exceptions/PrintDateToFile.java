package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PrintDateToFile {

	public static void main(String[] args) {
		String filename = "currentDate.txt";
		try(PrintWriter writer = new PrintWriter(filename)){
			writer.print(LocalDateTime.now());
		} catch(FileNotFoundException e) {
			System.err.println("Cannot find file " + filename);
		}

	}

}