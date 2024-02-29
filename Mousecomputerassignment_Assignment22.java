package conditionalstatements;
public class Mousecomputerassignment_Assignment22 {
	public static void main(String[] args) {
		for(int i=1;i<=500;i++) {
			if(i%3==0)
			{
				System.out.println("Computer " +i);
			}
			if (i%5==0) {
				System.out.println("Mouse " +i);
			}
			 if(i%3==0 && i%5==0) {
					System.out.println("ComputerMouse " +i);
				}
	}
		
	}
}


