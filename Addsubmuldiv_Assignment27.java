 package scannerprogramassignments;
import java.util.*;
public class Addsubmuldiv_Assignment27 {
/*Assignment 27
Create class and create 4 methods(add,sub,mul,div),add 2 variables
in each method but the input should come from scanner class for all
 methods.*/
	static void add() {
		Scanner s1=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Addition");
		System.out.println("Enter a:");
		a=s1.nextInt();
		System.out.println("Enter b:");
		b=s1.nextInt();
				int c =a+b;
		System.out.println("Sum is :" +c);
		s1.close();
	}
	
	 void sub() {
		Scanner s2=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Subtraction");
		System.out.println("Enter a:");
		a=s2.nextInt();
		System.out.println("Enter b:");
		b=s2.nextInt();
				int c =a-b;
		System.out.println("Difference is :" +c);
		s2.close();
	}
	 
	 void mult() {
			Scanner s3=new Scanner(System.in);
			int a;
			int b;
			System.out.println("Multiplication");
			System.out.println("Enter a:");
			a=s3.nextInt();
			System.out.println("Enter b:");
			b=s3.nextInt();
					int c =a*b;
			System.out.println("prod is :" +c);
			s3.close();
		} 
	 
	 void div() {
			Scanner s4=new Scanner(System.in);
			int a;
			int b;
			System.out.println("Division");
			System.out.println("Enter a:");
			a=s4.nextInt();
			System.out.println("Enter b:");
			b=s4.nextInt();
					int c =a/b;
			System.out.println("quotient is :" +c);
			s4.close();
		} 
	
	public static void main(String[] args) {
		add();
		Addsubmuldiv_Assignment27 a1 =new Addsubmuldiv_Assignment27();
		a1.sub();
		a1.mult();
		a1.div();
	}

}
