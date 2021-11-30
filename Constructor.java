package week2.day1;
//anything followed by () ----> function or method
//constructor is a special method, same name as class name
//signature of a method - accessModifier returntype methodName;
//sign. of method - accessModifier methodName(); (no need of return type)
//gateway of class - constructor, access non static & static methods
//key to class - it will run first
//helps to pass args in class
//JVM will create default constructor;
//heap memory
// line 10 - constructor syntax

public class Constructor {
	public Constructor() {
	 System.out.println("Constructor");
		
	}
	String aaa = "Test";
public static void main(String[] args) {
	Constructor obj = new Constructor();
	System.out.println(obj.aaa);

}
}
