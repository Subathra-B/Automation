package basicprograms;

public class Methodoverloading_Assignment3
{
	static void Suba(String a, char b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	static void Suba(char a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	 void Suba(int a,int b,double c) {
		double d =a*b/c;
		System.out.println(d);
	 }
	 void Suba(double a,int b,int c) {
		 double d =a*b/c; 
		 System.out.println(d);
	 }
	 void Suba(int a,double b,int c) {
		 double d =a*b*c; 
		 System.out.println(d);
	 }
	
	public static void main(String[] args) {
	Suba("test",'a');	
	Suba('m',"female");	
	Methodoverloading_Assignment3 m1=new Methodoverloading_Assignment3();
	m1.Suba(1,2,1.5);
	m1.Suba(3.2, 2, 2);
	m1.Suba(2,3.2,2);
	}

}
