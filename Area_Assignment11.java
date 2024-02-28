package area;

public  class Area_Assignment11{
	static void rectangle(double l, double b) {
		double a =l*b;
	System.out.println("The area of rectangle is:" +a);
	}
	void square(double s) {
		double a =s*s;
		System.out.println("The area of square is:" +a);
		}
	void triangle(double b, double h) {
		double a = (b*h)/2;
		System.out.println("The area of triangle is:" +a);
	}
	void circle(double r) { 
		double pi=3.14;
				double a = (pi*r*r);
		System.out.println("The area of circle is:" +a);
	}
	public static void main(String[] args) {
		rectangle(15,12.5);
		Area_Assignment11 a1 =new Area_Assignment11();
		a1.square(5.2);
		a1.triangle(3, 5);
		a1.circle(3);
	}
}