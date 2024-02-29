package conceptsonString;
import java.util.*;
public class Factorialassignment_Assignment38 {
	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=S1.nextInt();
	long factorial=1;
		for(int i=1;i<=num;i++) {
			 factorial = i*factorial;
		
		}
	System.out.println(factorial);	
	}

}
