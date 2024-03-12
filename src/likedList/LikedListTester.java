package likedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LikedListTester {

	public static void main(String[] args) {
		
		//List<Integer> Interfacesä
		//LinkedList<Integer> Konkrete Klasse
		List<Integer>list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		//Laufvariablel für Collectors
		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println();
//		}
//		itr = list.iterator();
//		while(itr.hasNext()) {
//			if(itr.next()== 3) {
//				itr.next();
//			}
//		}
//		itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println();
//		}
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(itr.next()==3) {
			itr.remove();
		}
		System.out.println(itr.next());
	}
	}
}
