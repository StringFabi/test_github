package queue;

public class ArrayQueue {

	private int capacity; 	//generelle Größe
	private int front;
	private int rear;
	private int [] queue;
	
	public ArrayQueue (int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
		
	}
	/*
	 * Getter + Setter
	 */
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	/*
	 * Überprüft ob Queue leer ist,
	 * True wenn Queue leer ist, sonst false
	 */
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	/*
	 * Überprüft ob Queue voll ist,
	 * True wenn Queue voll ist, sonst false
	 */
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	/*
	 * Fügt ein Element am Ende der Queue hinzu
	 */
	public void enqueue(int element) {
		if(!isFull()) {
			queue[rear] = element;
			rear++;
		} else {
			System.out.println("Queue is full!");
		}
	}
	/*
	 * Entfernt ein Objekt am Anfang der Queue
	 */
	public void dequeue() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		} else {
			System.out.println("Queue is empty!");
		}
	}
	/*
	 * Gibt das Element am Anfang der Queue zurück
	 */
	public int front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return -1; //keine saubere Lösung --> Exception Handling
	}
	/*
	 * Zeigt die Elemente der Queue an
	 */
	public void display() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				System.out.println(queue[i]);
			} 
		}else {
			System.out.println("Queue is empty!");
		}
	}
	
}
