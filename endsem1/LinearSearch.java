package endsem1;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[10];
		System.out.println("Enter elements to the Array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int x=sc.nextInt();
		int pos=-1;
		Boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				pos=i;
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index"+pos);
		}
		
		

	}

}
