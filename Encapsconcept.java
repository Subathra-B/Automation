class Parent{
	private String name ="Subathra";
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Encapsconcept extends Parent  {
	public static void main(String[] args) {
		Parent p1=new Parent();
	p1.setName("Subathra Hariharan");
	System.out.println(p1.getName());
	

	}

}
