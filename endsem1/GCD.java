package endsem1;
public class GCD {
	public static void main(String[] args) {
		int x=15;
		int y=21;
		int min=(x<y)?x:y;
		int GCD=1;
		for(int i=1;i<=min;i++) {
			if((x%i==0) &&( y%i==0)) {
				GCD*=i;
			}
		}
		System.out.println("GCD:"+GCD);

	}

}
