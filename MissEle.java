package javaconcept.basics;

public class MissEle {
public static void main(String[] args) {
	int ele[]= {1,2,3,4,6,7,8};
	for (int i = 0; i < ele.length; i++) {
		if(ele[i]!=i+1) {
			System.out.println("missing index " +i);
			break;
		}
	}
}
}
