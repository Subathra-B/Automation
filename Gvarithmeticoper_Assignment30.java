package scannerprogramassignments;
import java.util.*;
/*Assignment30:Create class
 *  create 4 methods(add,sub,mul,div),
use 2 variables but the input should come from 
scanner class by creating only one  object*/

public class Gvarithmeticoper_Assignment30 {
 Scanner s1 =new Scanner(System.in);
 int a; 
 int b;
 int c;
 void  add() {
	System.out.println("Addition");
	System.out.println("Enter number 1:");	
	a=s1.nextInt();
	System.out.println("Enter number 2:");
	b=s1.nextInt();
  	c=a+b;
  	System.out.println("Sum is:"+c);
}
 void  sub() {
		System.out.println("Subtraction");
		System.out.println("Enter number 1:");	
		a=s1.nextInt();
		System.out.println("Enter number 2:");
		b=s1.nextInt();
	  	c=a-b;
	  	System.out.println("Difference is:"+c);
	}
 
 void  mult() {
		System.out.println("Multiplication");
		System.out.println("Enter number 1:");	
		a=s1.nextInt();
		System.out.println("Enter number 2:");
		b=s1.nextInt();
	  	c=a*b;
	  	System.out.println("Product is:"+c);
	}
 void  div() {
		System.out.println("Division");
		System.out.println("Enter number 1:");	
		a=s1.nextInt();
		System.out.println("Enter number 2:");
		b=s1.nextInt();
	  	c=a/b;
	  	System.out.println("Quotient is:"+c);
	}
	public static void main(String[] args) {
		Gvarithmeticoper_Assignment30 g1= new Gvarithmeticoper_Assignment30();
g1.add();
g1.sub();
g1.mult();
g1.div();


	}

}
