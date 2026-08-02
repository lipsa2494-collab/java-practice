package midsem_01;
public class ArraySum {
	public static void main(String[] args) {
		int []A= {1,2,3,4,5};
		int result=SumArray(A);
		System.out.println("Sum of the elements of the array:"+result);		
	}
	public static int SumArray(int[] Arr) {
		int sum=0;
		for (int i=0;i<Arr.length;i++) {
			sum+=Arr[i];
		}
		return sum;
	}

}
