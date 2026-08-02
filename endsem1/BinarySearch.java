package endsem1;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int x=70;
		int l=0;
		int h=arr.length-1;
		int pos=-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if (arr[mid]==x) {
				pos=mid;
				break;
			}
			else if(x>arr[mid]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		if(pos==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index"+pos);
		}
		


	}

}
