package test;

interface interfaces1 {
	void add();
}

interface interfaces2 {
	void sub();
}

interface interfaces3 {
	void mul();
}

interface interfaces4 {
	void div();
}

interface interfaces5 {
	void mod();
}

public class AssignmentonInterface_Assignment32 implements interfaces1, interfaces2, interfaces3, interfaces4, interfaces5 {
	public static void main(String[] args) {
		AssignmentonInterface_Assignment32 a1 = new AssignmentonInterface_Assignment32();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
	}
	public void mod() {
		System.out.println("Modulus");

	}
	public void div() {
		System.out.println("Division");

	}
	public void mul() {
		System.out.println("multiplication");

	}
	public void sub() {
		System.out.println("subtraction");

	}
	public void add() {
		System.out.println("addition");
	}

}
