package hw3;

public class Node {

	// Since its doublyLL I have a link prev & next
	private Node prev;
	private Node next;

	// String
	private String data;

	Node(String data) {

		this.data = data;

		prev = null;
		next = null;

	}

	// getters
	public Node getPrev() {
		return prev;
	}

	public Node getNext() {
		return next;
	}

	public String getData() {
		return data;
	}

	// setters
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(String data) {
		this.data = data;
	}

}
