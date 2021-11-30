package javaconcept.basics;

public class ArmstrongNumber {
 public static void main(String[] args) {
	//1^3+5^3+3^3=153
    int num=153;
    int quo=0,rem, sum=0;
	while (num !=0) {
		quo = num/10;
		rem = num%10;
		sum = sum+(rem*rem*rem);
		num=quo;
	}
	num = 153;
    System.out.println("Sum Of Digits" +sum);
    System.out.println(num);
    
    if (num==sum) {
	   System.out.println("ARMSTRONG NUMBERS");
    }
    else {
	   System.out.println("Not Armstrong Number");
    }
 }
}
