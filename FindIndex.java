package javaconcept.basics;

public class FindIndex {
public static void main(String[] args) {
	String ind = "Welcome to Selenium";
	//first occurance
	int indexOf = ind.indexOf(' ');
	System.out.println(indexOf);
	//second occurance
	int indOf = ind.indexOf(' ', indexOf+1);
			System.out.println(indOf);
	
	

}
}
