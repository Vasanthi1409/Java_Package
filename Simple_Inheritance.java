package Package.com;

public class Simple_Inheritance extends Access_Specifiers {

	private void mango() {
		// TODO Auto-generated method stub
		System.out.println("Mango");
	}

	private void apple() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}

	public static void main(String[] args) {
		Simple_Inheritance s = new Simple_Inheritance();
		s.apple();
		s.mango();
		s.birds();
		s.cars();
		s.pets();
	}
}
