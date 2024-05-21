package queue;

public class TestProgramm {



	    public static void main(String[] args) {
	        ArrayQueue queue = new ArrayQueue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        queue.enqueue(60);

	        System.out.println("Queue elements:");
	        queue.display();

	        queue.dequeue();
	        queue.dequeue();

	        // Das Element an der Vorderseite der Queue anzeigen
	        System.out.println("Front element of the queue: " + queue.front());

	        // Elemente der Queue nach dem Entfernen anzeigen
	        System.out.println("Queue elements after dequeuing:");
	        queue.display();
	    }
	}
