package endsem1;

public class SumArrayFun {

	public static void main(String[] args) {
		int arr[]= {12,34,5,67,89};
		System.out.println(sum(arr));
		

	}
	public static int sum(int arr[]) {
		int summ=0;
		
		for(int i=0;i<arr.length;i++) {
			summ+=arr[i];
		}
		return summ;
	}

}
