package hw3;

public class List {

	// making the head
	private Node head;

	// making the tail
	private Node tail;

	// getters for head and tail since they're private *data encapsulation
	public Node getHead() {
		return this.head;
	}

	public Node getTail() {
		return this.tail;
	}

	// setters
	public void setHead(Node head) {
		this.head = head;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	// is Empty method evaluating head
	public boolean isEmpty() {
		return head == null;
	}

	// Size method
	public int size() {
		Node temp = head;
		int counter = 0;

		// while loop that iterates through nodes
		while (temp != null) {
			counter++;
			temp = temp.getNext();
		}

		return counter;

	}

	// Destroy
	public void destroy() {
		// Java destroys it since the head is null
		// other programming languages don't exactly do this
		head = null;
	}

	// Insert method
	public void insert(String s) {
		Node newNode = new Node(s);
		if (isEmpty()) {
			// goes from the right assigning newNode to tail to head
			head = tail = newNode;

		} else {
			// only one thing in list
			if (head == tail) {
				// head.compareToIgnoreCase(newNode)

				if (newNode.getData().compareToIgnoreCase(head.getData()) <= 0) {
					// new head
					head = newNode;
					head.setNext(tail);
					tail.setPrev(head);

				} else {
					// in the option if it comes afterwards
					tail = newNode;
					head.setNext(tail);
					tail.setPrev(head);

				}
			} else {
				// if it comes before the head
				if(){
					// if it comes after the tail
				} else if(){
					
					//if it's here it comes somewhere in between head and tail
				} else{
					// loop to traverse through list
					while(){
						// if it goes AFTER the while loop's node and BEFORE while loop's node.getNext, insert here
						if(() && ()){
							
							// otherwise, set the while loop's node to it's next and keep looking
						} else {
							
						}
					}
				}
				
			}
		}
	}

}
