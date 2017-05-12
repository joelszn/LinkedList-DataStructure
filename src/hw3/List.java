package hw3;

public class List {

	// making the head
	private Node head;

	// making the tail
	private Node tail;

	//getters for head and tail since they're private *data encapsulation
	public Node getHead() {
		return this.head;
	}
	public Node getTail() {
		return this.tail;
	}

	//setters
	public void setHead(Node head) {
		this.head = head;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
}
