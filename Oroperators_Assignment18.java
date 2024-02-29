package conditionalstatements;

public class Oroperators_Assignment18 {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		if (a < 15 || b > 14) {
			System.out.println("Both are true");
		}
		if (a > 9 || b > 16) {
			System.out.println("C2 is false");
		}

		if (a >= 11 || b < 17) {
			System.out.println("C1 is false");
		}
		
		// 10 >= 11 || 15 > 16 - return false
		if (a >= 11 || b > 16) {
			System.out.println("C1 and C2 are false");
		}else {
			System.out.println("Both are false");
		}
	}

}
