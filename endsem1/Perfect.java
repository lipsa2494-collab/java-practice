package endsem1;

public class Perfect {

	public static void main(String[] args) {
		int n=9;
		int s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				s+=i;
			}
		}
		if(s==n) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}
	}

}
