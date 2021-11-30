package javaconcept.basics;

import java.util.Arrays;

public class SmDup {
public static void main(String[] args) {
	int val[]= {0,42,12,31,41,42,52,26,74,80,12,31};
	Arrays.sort(val);
	boolean flag=false;
	for (int i = 0; i < val.length; i++) {
		for (int j = i+1; j < val.length; j++) {
			if(val[i]==val[j]) {
			System.out.print(val[i]+" ");
			flag=true;
		    }
		}
		if(flag==true) {
			break;
		}
	}
}
}
	
	
			
	


