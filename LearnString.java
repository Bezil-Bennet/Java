package javaconcept.basics;

public class LearnString {
	public static void main(String[] args) {
		String str = "Welcoeme";
		//find character giving its index no.
		System.out.println(str.charAt(2));
		//find index of character
		int indexOf = str.indexOf('e');		
		System.out.println(indexOf);
		//find length
		//length property - array
		//length method = string
		System.out.println(str.length());
		//find last index no
		System.out.println(str.lastIndexOf('e'));
		// find second occurance if e
		int indexOf2 = str.indexOf('e', indexOf+1);
		System.out.println("Second Occuranceof E" +indexOf2);
		// find third occurance if e
		int indexOf3 = str.indexOf('e', indexOf2+1);
		System.out.println("Third Occuarance Of E" +indexOf3);
		
		
	}
   

}
