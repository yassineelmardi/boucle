package ma.interfacetest;

class Book extends AbstractBook implements Sleepy {
	public Book(String name) {
//		this.name = name; // LINE A
//		System.out.println(this.name);
	}

	public static void main(String[] args) {
		AbstractBook philosophyBook = new Book("Principia Mathematica");
		System.out.println("The name of the book is " + philosophyBook.name); // LINE
																				// B
	}
}