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
	public void add(String s) {
		Node newNode = new Node(s);
		if (isEmpty()) {
			// goes from the right assigning newNode to tail to head
			head = tail = newNode;

		} else  {
			// only one thing in list
			if (head == tail) {
				// head.compareToIgnoreCase(newNode)

				if (newNode.getData().compareToIgnoreCase(head.getData()) < 0) {
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
				if (newNode.getData().compareToIgnoreCase(head.getData()) < 0) {
					head.setPrev(newNode);
					newNode.setNext(head);
					head = newNode;
					// if it comes after the tail
				} else if (newNode.getData().compareToIgnoreCase(tail.getData()) > 0) {
					tail.setNext(newNode);
					newNode.setPrev(tail);
					tail = newNode;

					// if it's here it comes somewhere in between head and tail
				} else {
					Node temp = head;
					// loop to traverse through list
					while (temp != null) {

						// if it goes AFTER the while loop's node and BEFORE
						// while loop's node.getNext, insert here
						if ((newNode.getData().compareToIgnoreCase(temp.getData()) > 0)
								&& (newNode.getData().compareToIgnoreCase(temp.getData()) < 0)) {

							newNode.setNext(temp.getNext());
							newNode.setPrev(temp);
							temp.getNext().setPrev(newNode);
							temp.setNext(newNode);
							// otherwise, set the while loop's node to it's next
							// and keep looking
						}
							temp = temp.getNext();
						}
					}
				}

			}
		}
	

	// printForward method
	public void printForward() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.getNext();
		}
	}
	
	// printForward method
		public void printBackward() {
			Node temp = tail;
			while (temp != null) {
				System.out.println(temp);
				temp = temp.getPrev();
			}
		}

}
