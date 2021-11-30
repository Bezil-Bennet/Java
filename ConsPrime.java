package javaconcept.basics;
//Prime numbers between 1 to 20
public class ConsPrime {
 public static void main(String[] args) {
	int num = 20;
	int count = 0;
	 for (int j = 1; j <=num; j++) {
	 count=0;
		for (int i=1;i<=j/2;i++) {
		  if (j%i==0) {
		  count = count+1;
		  }
	    }
        if (count==1) {
		System.out.println(j+"-Prime");
		}
		else {
		System.out.println(j+"Non Prime");
		}
	}
 }
}
		
