package scannerprogramassignments;
import java.util.Scanner;
public class Forloopusingscannerclass_Assignment28 {
	
/*Assignment 28: Print values 1 to 100 using for loop, 
 * but in this 1 and 100 should be come from scanner class*/

	public static void main(String[] args) {
	Scanner s1 =new Scanner(System.in);
	System.out.println("Enter the upper limit:");
	int j =s1.nextInt();
	System.out.println("Enter the lower limit:");
	for(int i=s1.nextInt();i<=j;i++) {
		System.out.println(i);
		s1.close();
	}

	}

}
