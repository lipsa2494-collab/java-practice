package midsem2;
public class Exception01 {
	public static void main(String[] args) { 
	int arr[]=new int[4];
	System.out.println("Before execution");
	try {
		int a=5;
		arr[9]=45;
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	System.out.println("After execution");
	}

}
