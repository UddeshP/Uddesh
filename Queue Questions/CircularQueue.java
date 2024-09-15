public class CircularQueue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		// a. reposition rear (inc)
		rear = (rear + 1) % SIZE;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public void pop() {
		// a. reposition front
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
	}
	
	public int peek() {
		//a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull() {
		return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	}
	
	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

}
