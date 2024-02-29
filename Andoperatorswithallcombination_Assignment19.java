package conditionalstatements;
public class Andoperatorswithallcombination_Assignment19 {
	public static void main(String[] args) {
	int a=100;
	int c=250;
	if(a<200 && c>a) {
		System.out.println("Both are true");
	}
	//C1 is false
	if(a>200 && a<c) {
		System.out.println("Condition1 is false");
	}
	//C2 is false	
if(a<200 && c>250) {
	System.out.println("Condition2 is false");
}
//C1 and C2 are false
	if(a>200 && c>250) {
		System.out.println("Both are false");
	}

	}
}
