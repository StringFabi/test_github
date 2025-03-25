package exceptions;
 
import java.util.regex.Pattern;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
 
public class NotesEinlesen {
 
	public static void main(String[] args)  {
		Pattern notes = Pattern.compile("C,?|D,?|E,?|F,?|G,?|A,?|B,?|c'?|d'?|e'?|f'?|g'?|a'?|b'?");
		String noten = "";
				try {
					Scanner sc = new Scanner(Paths.get("tunes.txt"));
					while(sc.hasNext()) {
						noten = noten + sc.nextLine() + " ";
					}
				} catch(IOException e) {
					System.err.print("Datei konnte nicht gefunden werden");
				}

				String filename = "abcTunes.txt";
				try (PrintWriter writer = new PrintWriter(filename)) {
					writer.println("M:C \n"
							+ "L:1/4 \n"
							+ "K:C");
					writer.print(noten);
				} catch(FileNotFoundException e) {
					System.err.print("Cannot find file " + filename);
				}
	}
 
}