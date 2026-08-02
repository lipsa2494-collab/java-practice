package midsem2;
import java.util.*;
class myException3 extends RuntimeException{
	myException3(String s){
		super(s);
	}
	myException3(){
		System.out.println("My own defined Exception");
	}
}
public class Exception8 {
	static void M(int a)throws myException3 {
		
		if(a!=0) {
			throw new myException3("Invalid input");
		}
	}
	public static void main(String[] args) {
		try {
			M(12);
		}
		catch(myException3 m) {
			System.out.println(m.getMessage());
		}
		
	}

}
