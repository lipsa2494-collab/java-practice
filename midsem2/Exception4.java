package midsem2;
public class Exception4 {
 static void Pass(int mark) throws ArithmeticException,Exception {
	 if(mark<0 || mark>100) {
		 throw new ArithmeticException("Invalid Mark");
		 
	 }
	 else {
		 System.out.println("Marks: "+mark);
	 }
 }
	public static void main(String[] args) {
	try {
		Pass(-1);
		
	}
	catch(ArithmeticException a) {
		System.out.println(a.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
