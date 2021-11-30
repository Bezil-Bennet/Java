package javaconcept.basics;

public class ArrDup {
	
public static void main(String[] args) {
 int dupArr[] = {7,13,21,45,67,95};
 int dupArr2[]= {32,68,21,45,23,33};
  for (int i=0;i<=dupArr.length-1;i++) {
   for (int j = 0; j < dupArr2.length; j++) {
    if (dupArr[i]==dupArr2[j]) {
	System.out.println("Duplicates"+dupArr[i]+ "="+dupArr2[j]);
	}
   }
  }
 
 
 }
}

