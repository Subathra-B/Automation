package area;

public class Circumference_Assignment12 {
	static void circle(double r) {
		double c = 2 * 3.14 * r;
		System.out.println("The circumference of the circle is :" + c);
	}

	void square(double s) {
		double p = 4 * s;
		System.out.println("The perimeter of the square is :" + p);
	}

	void rectangle(double l, double b) {
		double p = 2 * (l + b);
		System.out.println("The perimeter of the rectangle is :" + p);
	}

	public static void main(String[] args) {

		circle(3.5);
		Circumference_Assignment12 c1 = new Circumference_Assignment12();
		c1.square(2.8);
		c1.rectangle(3.2, 5);
	}

}
