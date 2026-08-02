package endsem1;

public class Leap {
	public static void main(String args[]) {
	int year=2002;
	if( (year%400==0 )||((year % 4==0) && (year%100 !=0))) {
		System.out.println("Leap Year");
	}else {
		System.out.println("Not a leap year");
	}

}
}