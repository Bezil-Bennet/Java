package javaconcept.basics;

public class NumOfDig {
public static void main(String[] args) {
int num=676746080;
int count= 0;
 while(num!=0) {
	 num=num/10;
	 count=count+1;
 } 
	System.out.println("Number of Digits ="+count);
 
	
}
}
