package midsem_01;
import java.util.Scanner;
public class practice2 {
	public static void main(String[] args) {
//		int x=5,y=6;
//		System.out.println(x&y);
//		System.out.println(x|y);
//		System.out.println(x^y);
//		System.out.println(~x);
//		System.out.println(~y);
//		System.out.println((byte)x<<y);
//		System.out.println((byte)x>>y);
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 5 numbers:");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int z=sc.nextInt();
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		if(x>y && x>z && x>a && x>b) {
//			System.out.println(x+" is larger");			
//		}
//		else if(y>z && y>a && y>b) {
//			System.out.println(y+" is larger");
//		}
//		else if (z>a && z>b) {
//			System.out.println(z+" is larger");
//		}
//		else if(a>b) {
//			System.out.println(a+" is larger");
//		}
//		else {
//			System.out.println(b+" is larger");
//		}
		System.out.println("Enter month");
	    String m = sc.next().toLowerCase();
//	    if (m.equals("jan") || m.equals("mar") || m.equals("may")||m.equals("july")||m.equals("aug")||m.equals("oct")||m.equals("dec")) {
//	    	System.out.println(m+" has 31 days.");
//	    }
//	    else if(m=="feb") {
//	    	System.out.print("Enter Year:");
//	    	int y=sc.nextInt();
//	    	if(y % 400 ==0 || (y% 100 !=0 && y%4==0)) {
//	    		System.out.print(m+" has 29 days");	    		
//	    	}
//	    	else {
//	    		System.out.print(m+" has 28 days.");
//		
//	    	}
//	    }
//	    else {
//	    	System.out.print(m+"has 30 days");
//	    }
//		
	    if((m=="jan") ||( m=="mar" )) {
	    	System.out.println(m+" has 31 days");
	    }
	    else {
	    	System.out.println(m+" has 30 days");
	    }
		
		
		
		
	}

}
