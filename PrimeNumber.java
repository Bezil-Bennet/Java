package javaconcept.basics;
//number divisible by itself
//only it will have 2 factors (only 2 count)

public class PrimeNumber {
 public static void main(String[] args) {
  int num = 23;
  int count = 0;
	for (int i=1;i<= num/2;i++) {
	  if (num %i==0) {
	  count = count+1;
	  }
    }
	if (count==1) {
	System.out.println("Prime" +num);
	}
	else {
	System.out.println(num+ "Non Prime");
	}
 }
}


	
	



