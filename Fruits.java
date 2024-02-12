package Package.com;

public class Fruits {

	public void apple() {
		System.out.println("Apple");
	}

	public void banana() {
		System.out.println("Banana");
	}

	public static void main(String[] args) {

		System.out.println("List out fruits:");

		Fruits f = new Fruits();
		f.orange(); 
		f.apple();
		f.banana();
		f.grapes();

	}

	public void orange() {
		System.out.println("Orange");
	}

	public void grapes() {
		System.out.println("Grapes");
	}

}
