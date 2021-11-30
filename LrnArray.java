package javaconcept.basics;

import java.util.Arrays;

public class LrnArray {
 
 public static void main(String[] args) {
	 int Arr[]= {151,112,103,124,165};
	System.out.println("firstelement" + Arr[0]);
	
	//find length
	int length = Arr.length;
	System.out.println("length"+length);
	
	//find last element
	System.out.println("last element"+Arr[length-1]);
	
	//find index of an element - arrayutils 
	
	
	//print array
	System.out.println("Before sorting");
	for (int i = 0; i < length; i++) {
		System.out.println("Arr[" +i+ "]:"+Arr[i]);
	}
	
	//find largest num.
	System.out.println("After Sorting");
	Arrays.sort(Arr);
	for (int i = 0; i < Arr.length; i++) {
		System.out.println("Arr[" +i+ "]:"+Arr[i]);
	}
	
	System.out.println("Largest number"+Arr[length-1]);
	System.out.println("Smallest no" +Arr[0]);
	
	
	
	
	
}
}