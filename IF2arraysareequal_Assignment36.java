package formyownpractice;

import java.util.Arrays;

public class IF2arraysareequal_Assignment36 {

	public static void main(String[] args) {
		int a1[]=new int[2];
		a1[0]=45;
		a1[1]=35;
		
		int b1[]=new int[2];
		b1[0]=45;
		b1[1]=38;
	
				if(a1.length!=b1.length) {
			System.out.println("Arrays are not equal");
			}
		else {
			if (Arrays.equals(a1, b1)==true) {
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("The value of arrays are not equal");
			}
		}
				

	}

}
