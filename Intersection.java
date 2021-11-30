package javaconcept.basics;

public class Intersection {
public static void main(String[] args) {
	int arr1[]= {2,5,6,9,0,2};
	int arr2[]= {1,3,6,8,0,4};
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
			}
		}
	}
}
}
