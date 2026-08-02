package midsem_01;
public class Q11 {
	public static void main(String[] args) {
		System.out.println("The running sum of first 25 numbers :");
		for (int i=1;i<=25;i++) {
			System.out.println(Sum(i));
		}		
	}
	public static int Sum(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n+Sum(n-1);
		}
	}
}
