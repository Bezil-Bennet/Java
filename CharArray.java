package javaconcept.basics;
//character occurance

public class CharArray {
	public static void main(String[] args) {
		//using charArray
		String name = "welcome to selenium learning";
		int count=0;
		
		for(int i=0;i < name.length(); i++) {
		char[] charOcc = name.toCharArray();
		 if (charOcc[i]=='e') {
			 count=count+1;
		 }
		 
		}
		System.out.println(count);
		
		
		//using charAt
		int count1 = 0;
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			if (charAt=='e') {
				count1=count1+1;
			}
		}
		System.out.println("Occurance of e using CharAt:" +count1);
	}
	
}
