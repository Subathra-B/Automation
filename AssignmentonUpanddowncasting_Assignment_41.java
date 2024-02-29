package learningtypecasting;
class class_4{
	void add() {
	System.out.println("Addition");	
	}
}
class class_3 extends class_4{
	void sub() {
		System.out.println("Subtraction");	
	}
}
class class_2 extends class_3{
	void mul() {
		System.out.println("multiplication");		
	}
}
public class AssignmentonUpanddowncasting_Assignment_41 extends class_2{
	void div() {
		System.out.println("division");	
	}

	public static void main(String[] args) {
	
		class_4 c4=new class_3();
		c4.add();//upcasted c3 to c4
		//in order to downcast c3 to c2, first c2 should be upcasted to c3 as below.
		class_3 c3=(class_3) new class_2();
		c3.sub();//c2 is also upcasted to c3.
		c3.add();//since c3 is  upcasted to c4.
		//downcast c3 to c2 so that all the methods from c2,c3,c4 will be upcasted
		//and child class method will not be available
		class_2 c2= (class_2)c3;
		c2.add();
		c2.sub();
		c2.mul();
	}
}
