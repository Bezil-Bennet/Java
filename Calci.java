package javaconcept.basics;

public class Calci {
public void add() {
	int x=10,y=12;
	int z= x+y;
	System.out.println(z+ "add");
	}
public void add1(int x, float y) {
	float sum =x+y;
System.out.println(sum+ "add1");
}
public int addreturn() {
	int x= 90,y=10;
	int z= x+y;
	return z;
	
}
public int addRetArg(int x,int y) {
	int sum = x+y;
	return sum;

}
public static void main(String[] args) {
	Calci calc = new Calci();
	calc.add();
	calc.add1(30, 40F);
	int addreturn = calc.addreturn();
	System.out.println(ad);
	int result2= calc.addRetArg(29,31);
	System.out.println(result2+ "return");
	
}
}
