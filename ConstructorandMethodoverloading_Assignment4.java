package basicprograms;

public class ConstructorandMethodoverloading_Assignment4 {
	ConstructorandMethodoverloading_Assignment4(){
		System.out.println("Test constructor");
	
	}
	ConstructorandMethodoverloading_Assignment4(double a,int b){
		double c =a*b;
		System.out.println(c);
	}
	static void Suba(int a , int b) {
		int c = a*b;
		System.out.println(c);
	}
	void Suba(double a, double b) {
		double c = a*b;
		System.out.println(c);
	}
	
 public static void main(String [] args) {
	 ConstructorandMethodoverloading_Assignment4 m1=new ConstructorandMethodoverloading_Assignment4();
	Suba(4,2);
	new ConstructorandMethodoverloading_Assignment4(3.2,4);
	m1.Suba(3.6,4.8);
	}
	}

