package midsem2;
import java.util.*;
class CustomException2 extends Exception{
	CustomException2(String s){
		super(s);
	}
	CustomException2(){
		System.out.println("My owned defined constructor");
	}
	
}
public class Exception7 {
 static void Test() throws CustomException2{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int x=sc.nextInt();
	 
		 if(x>100) {
			 throw new CustomException2("Error occured");
		 }
		 else {
			 System.out.println("Number: "+x);
		 }
 }
	public static void main(String[] args) {
		try {
			Test();
			
		}
		catch(CustomException2 c) {
			 System.out.println(c.getMessage());
		 }
	}

}
