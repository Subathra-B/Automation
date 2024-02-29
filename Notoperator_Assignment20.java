package conditionalstatements;

public class Notoperator_Assignment20 {

	public static void main(String[] args) {
		//Not operator with || inside the condition
		int a=10;
		boolean b= false;
		
		//true condition inside the bracket hence the output is not printed
		if(!(a<20||b==true)) {
			System.out.println("Do not print");	
		}
//false condition inside the bracket hence output is printed
  if(!(a>20 ||b==true)) {
	System.out.println("Please Print");
}
//Not operator with && inside the condition
//true condition inside the bracket hence the output is not printed
  if(!(a>5 && b==false)) {
	  System.out.println("No output"); 
	  
  }
//false condition inside the bracket hence output is printed
  if(!(a<5 && b==true)) {
	  System.out.println("Print output"); 
	  
  }
  
	}

}
