package endsem1;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of all elements in the array is "+sum);
		
	}

}
