package midsem2;
public class StringStringBuilder {
	public static void main(String[] args) {
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");
//		String s4=new String("Hello");
		
		StringBuilder sb1=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Hello");
		if(sb1==sb2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diiferent");
		}

	}

}
