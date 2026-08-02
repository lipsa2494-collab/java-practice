package midsem_01;

public class SwapNum {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		System.out.println("Before calling Swap method a= "+a+" b= "+b);
		Swap(a,b);
		System.out.println("After calling Swap method a="+a+" b="+b);
		
	}public static void Swap(int a, int b) {
		System.out.println("Before swapping inside method:a="+a+" b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping inside method : a="+a+" b= "+b);	
		}
		
	

}
