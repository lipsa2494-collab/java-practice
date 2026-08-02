package midsem2;
class myException extends Exception{
	
}
public class Assign1q3 {
	public static void main(String[] args) {
		System.out.println("Before Execution method call");
		try {
			throw new myException();
		}
		catch(myException e) {
			System.out.println("Exception handled");
		}
		System.out.println("Program execution completed successfully");

	}

}
