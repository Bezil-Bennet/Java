package javaconcept.basics;

public class Assignment {
 public static void main(String[] args) {
   System.out.println("Even numbers between 1 to 50");
		for(int i=1;i<50;i++) {
			if (i%2==0) {
			System.out.println(i);
			}
		}
	
	System.out.println(" NumberDivisibleBy3-TRIZZ;\n NumberDivisibleBy5-FRIZ;\n NumberDivisibleByBoth-TRIZZ:FRIZ");
	int num = 1068;
	if (num%3==0) {
		System.out.println("TRIZZ");
	}
	if (num%5==0) {
		System.out.println("FRIZZ");
	}
	if (num%3==0&&num%5==0) {
		System.out.println("TRIZZ FRIZZ");
	}
	}

	
	
	
	
	}

