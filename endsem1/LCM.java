package endsem1;

public class LCM {

	public static void main(String[] args) {
		int a=15;
		int b=21;
		int max=(a>b)?a:b;
		int LCM=1;
		while (true) {
			if((max%a==0)&&(max%b==0)){
				LCM*=max;
				break;
			}
			else {
				max+=1;
			}
			
			
		}
		System.out.println("The lcm of the numbers is:"+LCM);
			

	}

}
