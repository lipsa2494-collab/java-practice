package midsem_01;

public class SumNum {

	public static void main(String[] args) {
		System.out.println("sum of 10 and 20 :"+Sum(10,20));
		System.out.println("sum of 4,5,6,8 :"+Sum(4,5,6,8));
		System.out.println("sum of 5,10,15,20,25 :"+Sum(5,10,15,20,25));
		
	}
	public static int Sum(int...num) {
		int total=0;
		for (int n:num) {
			{
				total+=n;
			}
			
		}
		return total;
	}

}
