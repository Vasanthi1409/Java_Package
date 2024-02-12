package Package.com;

public class Access_Specifiers {
	private void flowers() {
		// TODO Auto-generated method stub
		System.out.println("Lotus");
		System.out.println("Jasmine");
	}

	public void cars() {
		// TODO Auto-generated method stub
		System.out.println("Swift");
		System.out.println("KIA");
	}

	void pets() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
		System.out.println("Elephant");
	}

	protected void birds() {
		// TODO Auto-generated method stub
		System.out.println("Peacock");
		System.out.println("Parrot");
	}

	public static void main(String[] args) {
		Access_Specifiers fl = new Access_Specifiers();
		System.out.println("List out the flowers");
		fl.flowers();
		System.out.println("List out the cars");
		fl.cars();
		System.out.println("List out the pets");
		fl.pets();
		System.out.println("List out the birds");
		fl.birds();
	}
}
