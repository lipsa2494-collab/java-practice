package endsem1;
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {12,35,46,78,90,32,54,11,29,89,76};
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				
			}
		}
		System.out.println("Array after sorting the order in ascending order is :");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
