package midsem2;
class calculation{
	
	static int mul(int a,int b) {
		return a*b;
	}
	static int divide(int x,int y) {
		return x/y;
	}
}
public class Staticmember {
	public static void main(String[] args) {
		System.out.println(calculation.mul(10, 2));
		System.out.println(calculation.divide(45,9));
	}

}
