package basicprograms;

public class Constructor_Assignment2 {
	Constructor_Assignment2() {
		System.out.println("No paramater");
	}

	Constructor_Assignment2(int a) {
		int c = a + 9;
		System.out.println(c);
	}

	Constructor_Assignment2(boolean a) {

		System.out.println(a);
	}

	Constructor_Assignment2(String a) {

		System.out.println(a);
	}
	
	Constructor_Assignment2(char a) {

		System.out.println(a);
	}

	public static void main(String[] args) {
		new Constructor_Assignment2();
		new Constructor_Assignment2(11);
		new Constructor_Assignment2(false);
		new Constructor_Assignment2("Hello world");
		new Constructor_Assignment2('m');
	}

}
