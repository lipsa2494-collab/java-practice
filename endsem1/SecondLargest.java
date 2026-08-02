package endsem1;
public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {12,45,78,69,56,43,90,32};
		int largest=arr[0];
		int second_largest=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}
			else if((arr[i]>second_largest)&& (arr[i]!=largest)) {
				second_largest=arr[i];
			}
		}
		System.out.println("Largest element is"+largest);
		System.out.println("Second largest element is"+second_largest);
	}

}
