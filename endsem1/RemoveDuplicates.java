package endsem1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {10,34,56,78,45,34,56,10,35};
		Boolean isDuplicate=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if (arr[i]==arr[j] ){
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate==false) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
