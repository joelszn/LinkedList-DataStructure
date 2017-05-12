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
		Node temp= head;
		int counter = 0;
		
		//while loop that iterates through nodes
		while(temp !=null){
			counter ++;
			temp = temp.getNext();
		}

		return counter;

	}

	// Destroy
	public void destroy(){
		//Java destroys it since the head is null
		//other programming languages don't exactly do this
		head = null;
	}

	// Insert method
	public void insert(String s) {
		Node newNode = new Node(s);
		if(isEmpty()){
			//goes from the right assigning newNode to tail to head
			head = tail = newNode;
			
		} else {
			//only one thing in list
			if (head == tail){
				
			}
		}
	}

}
