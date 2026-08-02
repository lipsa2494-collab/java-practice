package exception;
import java.io.*;
public class Exception2 {
     static void Test(int m) {
    	   try {
    		   if (m<0 || m>100) {
    			   throw new Exception("Invalid mark");
    		   }
    		   else {
    			   System.out.println("Mark: "+m);
    		   }
    	   }
    	   catch(Exception e) {
    		   System.out.println(e.getMessage());
    	   }
     }
	public static void main(String[] args) {
		int mark1=78;
		int mark2=-14;
		Test(mark1);
		Test(mark2);
		System.out.println("Execution completed successfully");
		
	}

}
