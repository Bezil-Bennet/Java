package javaconcept.basics;

public class FibonacciSeries {
public static void main (String [] args ) {
	int firDig= 0,secDig = 1, TirDig;
	System.out.println("Fibonacci series");
	for (int i = 1; i <=8; ++i) {
	
        System.out.print(firDig + ",");
		TirDig = firDig+secDig;
		firDig=secDig;
		secDig=TirDig;
	}	
}
}
