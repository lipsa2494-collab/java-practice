package endsem1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int odd=0;
		int even=0;
		System.out.println("Enter the elements to the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				even+=1;
			}
			else {
				odd+=1;
			}
		}
		System.out.println("The no of even elements in the array is "+even);
		System.out.println("The no of odd numbers in the array is "+odd);

	}

}
