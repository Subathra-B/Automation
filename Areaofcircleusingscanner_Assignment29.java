package scannerprogramassignments;
import java.util.*;
/* Assignment 29:Find out the Area of a circle,where "r " 
 should be come from scanner class*/

public class Areaofcircleusingscanner_Assignment29 {
static double pi=3.14;
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter radius :");
	double r =s1.nextDouble();

	double area= pi*r*r;
	System.out.println("Area of the circle is:" +area);
	s1.close();

	}

}
