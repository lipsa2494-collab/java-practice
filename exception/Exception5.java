package exception;
import java.io.*;
class newException extends Exception{
	newException(){
		System.out.println("Exception handled");
	}
	newException(String s){
		super(s);
	}
}

public class Exception5 {
	static void Test2(int m) throws newException{
		if(m<0 ||m>100) {
			throw new newException("Invalid marks");
			
		}
		else {
			System.out.println("Marks: "+m);
		}
	}
	public static void main(String[] args) {
		int m=-12;
		try {
			Test2(m);
		}
		catch(newException n) {
			System.out.println(n.getLocalizedMessage());
		}
	}

}
