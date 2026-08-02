package endsem1;

public class DigitSum {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int r;
		while (num!=0) {
			r=num%10;
			sum+=r;
			num/=10;
			
		}
		System.out.println("The sum of all the digits of the number is:"+sum);
	}

}
