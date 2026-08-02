package endsem1;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		int a[]=new int[n];
		int start=0;
		int end=n-1;
		System.out.println("Enter elements to the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		while(start<end) {
				int temp=a[end];
				a[end]=a[start];
				a[start]=temp;
				start++;
				end--;
			}
			System.out.println("The reversed array is:");
			for (int j=0;j<a.length;j++) {
				System.out.println(a[j]+" ");
			}
			
		}

	}


