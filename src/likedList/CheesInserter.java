package likedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheesInserter {
	//private = Sichtbarkeit auf die eigene Klasse beschr�nkt
	//static = unabh�ngig von einem Objekt geh�rt zur Klasse
	//final = Wert der Variable nach Initialisierung unver�ndert
	private static final Pattern vegetables = Pattern.compile(
		"Zucchini|Paprikas?|Tomaten?|Zwiebeln?"
	);
	//for Schleife mit Iterator als Laufvariable
	public static void insertCheesAroundVegetables(List<String>ingredians) {
		for(ListIterator<String> iterator = ingredians.listIterator();
				iterator.hasNext();) {
			String ingredian = iterator.next();
			//�berpr�ft, ob die Zutat zu unserem Pattern passt
			if(vegetables.matcher(ingredian).matches()) {
				iterator.add("K�se");
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> ingredians = new ArrayList<>();
		Collections.addAll(ingredians, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln");
		insertCheesAroundVegetables(ingredians);
		System.out.println(ingredians);

	}

}
