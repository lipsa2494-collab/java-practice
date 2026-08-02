package endsem1;
import java.util.Scanner;
public class LargeEleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int max=arr[0];
		System.out.println("Enter elements to the array:");
		for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		if (arr[i]>max) {
			max=arr[i];
		}
		}
		System.out.println("The maximum element in the array is "+max);
	}

}
