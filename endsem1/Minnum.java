package endsem1;

public class Minnum {

	public static void main(String[] args) {
		int s=min(13,78,45,1,90);
		System.out.println(min(s));
		
	}
	public static int min(int...n) {
		int min=n[0];
		for(int i=1;i<n.length;i++) {
			if(min>n[i]) {
				min=n[i];
			}
		}
		return min;
	}

}
