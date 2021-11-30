package javaconcept.basics;

import java.util.Arrays;

public class RemDup {
public static void main(String[] args) {
	int rem[] = {10,22,10,11,22,34};
	Arrays.sort(rem);
    for (int i = 0; i < rem.length-1; i++) {
    		if(rem[i]!=rem[i+1]) {
			  System.out.println(rem[i]);
			}
    }
    System.out.println(rem[rem.length-1]);
}
 }

