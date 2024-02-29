package conditionalstatements;

public class Ifblocksinsideifelse_Assignment16 {
	public static void main(String[] args) {
	int a=1000;
	int b=50;
	
	if(a>b) {
		if(a<500) {
			System.out.println("a is less than 500");
		}
	    if(a>50) {
	    	System.out.println("a is greater than 50");
	    	
	    }

		if(a>=100) {
			System.out.println("The value of a is:" +a);
		}
		
	}
	else {
		System.out.println("sorry a is not greater than b");
	}
	
	}

} 
