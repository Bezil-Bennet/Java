package javaconcept.basics;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "Have a Good Day";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt=='a') {
				count = count+1;
		
			}
		}
		System.out.println("Number of a occured"+count);	
		
		
       //convert string into array
		String str1="I want learn selenium";
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Array"+i+":"+charArray[i]);
		}
		//string Array
		String str3= "Come here soon";
		String[] str4 = str3.split(" ");
		for (int i = 0; i < str4.length; i++) {
			System.out.println("string ["+i+"]"+str4[i]);
		}
		
		//
	
		
	}

}
