package midsem_01;

public class q8 {

	public static void main(String[] args) {
		System.out.println("First 25 fibonacci numbers are:");
		for (int i=1;i<=25;i++) {
			System.out.print(Fibonacci(i)+" ");
		}
		
	}
	public static int Fibonacci(int n) {
		if (n==1 || n==2) {
			return 1;
		}	
		else {
			return Fibonacci(n-1) +Fibonacci(n-2);
			}
		}
}
