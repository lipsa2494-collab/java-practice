package endsem1;

public class SwapValues {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		System.out.println("before swapping a: "+a+" b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a: "+a+" b: "+b);
		
	}

}
