package exception;
import java.io.*;
class myException extends Exception{
	myException(){
		System.out.println("MYself-defined constructor");
	}
	myException(String s){
		super(s);
	}
}
public class Eception6 {
	public static void main(String[] args) {
		System.out.println("Before exception method call");
		int a=2;
		try {
			if(a!=1) {
				throw new myException();
			}

		}
		catch(myException m) {
			System.out.println("Exception handled");
		}
		System.out.println("After Exception method call");
	}

}
