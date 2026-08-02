package endsem1;

public class Sumfun {

	public static void main(String[] args) {
		int n=25;
		for(int i=1;i<=25;i++) {
			System.out.println(sum(i));
		}
	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+(sum(n-1));
		
		}
		}

}
