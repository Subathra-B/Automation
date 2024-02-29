package test;

public class Stringpractice_Assignment35 {
	
public static void main(String[] args) {
	String name="RamMohan";
	int a=name.length();
	System.out.println(a);
	System.out.println(name.charAt(5));
	System.out.println(name.indexOf('M'));
	System.out.println(name.concat(" ").concat("Sundar"));
	String b= "  ZZ  ";
	System.out.println(b.trim());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	String c="RamMohan";
	System.out.println(name.equals(c));
	System.out.println(name.substring(3));
	System.out.println(name.substring(3,8).concat(name.substring(0,3)));
	System.out.println(name.endsWith("n"));
}
}
