package midsem2;
import java.io.*;
import java.util.*;
class Exception1{
	
}
	
public class ThrowThrows1 {
	static void input(int mark) {
		try {
		if (mark<0 || mark>100) {
			throw new Exception("Invalid mark");
		}
		else {
			System.out.println("Marks: "+mark);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int m=sc.nextInt();
//		try {
//			input(45);
//		    input(-23);
//		}
		int marks=90;
		input(marks);
		input(-100);
		
	}

}
