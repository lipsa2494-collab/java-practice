package exception;
import java.io.*;
public class Exception3 {
     static void Test1(int m)  throws RuntimeException{
    	 try {
    	 if (m<0 ||m>100) {
    		 throw new RuntimeException("Invalid marks");
    	 }
    	 else {
    		 System.out.println("Marks: "+m);
    	 }
    	 }
    	 catch(Exception r){
    		 System.out.println("Exception handled");
 			System.out.println(r.getMessage()); 
    	 }
     }
	public static void main(String[] args) {
		int m1=89;
		int m2=-12;
		Test1(m1);
		Test1(m2);
		
	}

}
