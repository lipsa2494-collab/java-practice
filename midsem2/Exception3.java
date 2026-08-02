package midsem2;
import java.util.*;
class ThrowThrows{
	public static void Test(int m) {
		
		try {
			if(m<0 || m>100) {
				throw new Exception("Invalid mark");
			}
			else {
				System.out.println("Marks: "+m);
			}
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}
public class Exception3 {
	public static void main(String[] args) {
		ThrowThrows.Test(101);
		System.out.println("Execution completed");
	}

}
