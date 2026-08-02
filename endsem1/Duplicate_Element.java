package endsem1;

public class Duplicate_Element {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,10,40,37,68,20,30,67};
		
		for (int i=0;i<arr1.length;i++) {
			Boolean is_duplicate=false;
			for (int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					is_duplicate=true;
					break;
				}
				
				
			}
			if(is_duplicate==false){
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		
	}

}
