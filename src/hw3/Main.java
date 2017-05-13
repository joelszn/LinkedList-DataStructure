package hw3;

public class Main {

	public static void main(String[] args) {

		List newLL = new List();

		newLL.add("Fruit");
		newLL.add("Apple");

		newLL.add("Grape");

		newLL.printForward();
		System.out.println();
		newLL.printBackward();
		System.out.println();
		newLL.search("Fruit");
		
		newLL.search("JOEL");

	}

}
