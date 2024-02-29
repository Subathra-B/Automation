package practicefortest0213;

import java.util.Scanner;

public class Tocheckonlydigits_Assignment37 {

	public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the input");
String input=S1.next();
char b[]=input.toCharArray();
int numofdigits=0;
int numofalpha=0;
int numofspaces=0;
for(int i=0;i<input.length();i++) {
	if(Character.isDigit(b[i])) {
		numofdigits++;
		}
	
if(Character.isAlphabetic(b[i])) {
	numofalpha++;
	
}
if(Character.isWhitespace(b[i]))	{
	numofspaces++;
}
}
if(numofalpha>0||numofspaces>0) {
	System.out.println("Input contains alphabets and spaces");
}
else {
	System.out.println("Input contains only digits");
}
	}

}
