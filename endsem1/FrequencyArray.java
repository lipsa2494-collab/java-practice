package endsem1;

public class FrequencyArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,10,40,20,50,80,10,90,78,40,10,30,80};
		System.out.println("Element     Frequency");
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==-1) {
				continue;
			}
			int count=1;
			for(int j=0;i<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
			}

}
