package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Kommentare {

	public static void reduceToComments(List<String>lines) {

		for(int i = 0; lines.size()<i;i++) {

			if(i+1 %4 ==0) {

			lines.remove(i);

			}

		}

	}

	public static void main(String[]args) {

		List<String> lines = new ArrayList<>();

        lines.add("A1");

        lines.add("A2");

        lines.add("A3");

        lines.add("A4");

        lines.add("B1");

        lines.add("B2");

        lines.add("B3");

        lines.add("B4");

        lines.add("C1");

        lines.add("C2");

        lines.add("C3");

        lines.add("C4");

        Kommentare.reduceToComments(lines);

        System.out.println("reduced Liste:");

        for (String line : lines) {

            System.out.println(line);

	}

	}

}

