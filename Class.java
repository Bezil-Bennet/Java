package javaconcept.basics;

public class Class {
	String brandName;
	int memory;
	char logo;
	int resolution;
	long imei;
	boolean isCharge;
	
	
	public static void main(String[] args) {
		Class sumsung = new Class();
		sumsung.brandName="galaxy";
		sumsung.imei=1234567890;
		sumsung.logo='S';
		System.out.println(sumsung.brandName);
		
		Class apple = new Class();
		apple.brandName= "aaaaa";
		apple.isCharge=true;
		apple.logo='A';
		System.out.println(apple.logo);
		
	}
	}

