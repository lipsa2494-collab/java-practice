package exception;
import java.io.*;
class InvalidVoter extends Exception{
	InvalidVoter(){
		System.out.println("Invalid age to vote");
	}
	InvalidVoter(String s){
		super(s);
	}
}
class AgedVoter extends Exception{
	AgedVoter(){
		System.out.println("greater than 100");
	}
	AgedVoter(String s){
		super(s);
	}
}
public class Exception7 {
	static void age(int a) throws AgedVoter,InvalidVoter{
		
			if(a<18) {
				throw new InvalidVoter("Age less than 18");
			}
			else if(a>100) {
				throw new AgedVoter("Age is greater than 100");
			}
			else {
				System.out.println("Valid age to vote");
			}
	}
	public static void main(String[] args) {
		int age1=45;
		int age3=12;
		int age2=102;
         try {
        	 age(age1);
        	 age(age2);
        	 age(age3);
         }
         catch(InvalidVoter i) {
 			System.out.println(i.getMessage());
 		}
 		catch(AgedVoter v) {
 			System.out.println(v.getMessage());
 		}
 		finally {
 			System.out.println("Exception handled");
 		}
	}

}
