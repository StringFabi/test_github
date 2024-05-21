package likedList;

public class MusicalCharisGame {

	public static void main(String[] args) {
	
		MusicalChairs mc1 = new MusicalChairs("Leo", "Max", "Paul", "Anna");
		MusicalChairs mc2 = new MusicalChairs("Madlaine", "Ben");

		System.out.println(mc1);
		System.out.println(mc2);
		mc1.rotate(2);
		System.out.println(mc1.play());
	}

}
