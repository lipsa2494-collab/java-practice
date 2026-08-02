package exception;
import java.io.*;
public class Exception4 {
	static void Testt(int m) throws Exception {
		if(m<0 ||m>100) {
			throw new Exception();
		}
		else {
			System.out.println("Marks: "+m);
		}
	}
	public static void main(String[] args) {
		int m1=-8;
		try {
			Testt(m1);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Program executed successfully");
		}
	}
}
