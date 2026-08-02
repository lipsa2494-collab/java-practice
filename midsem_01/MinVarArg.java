package midsem_01;

public class MinVarArg {

	public static void main(String[] args) {
		int series=findMin(12,45,78,9,51);
		System.out.println("Minimum number :"+series);
	}
	public static int findMin(int...n) {
		int min=n[0];
		for (int i=1;i<n.length;i++) {
			if (n[i]<min) {
				min=n[i];
			}
			
		}
		return min;
		
	}

}
