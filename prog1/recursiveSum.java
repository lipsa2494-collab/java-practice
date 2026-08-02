package prog1;
public class recursiveSum {
	public static void main(String[] args) {
		int n=12345;
		System.out.println("Sum of digits:"+Add(n));
			
}
	public static float Add(int n) {
		if (n==0){
			return 0;
		}
		else {
			return (n%10)+Add(n/10);
		}
		
		
	}
}