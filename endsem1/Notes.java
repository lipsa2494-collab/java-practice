package endsem1;

public class Notes {

	public static void main(String[] args) {
		int rupees=789;
		int h=rupees/100;
		System.out.println("The number of rs 100 notes is "+h);
		rupees=rupees%100;
		
		int f=rupees/50;
		System.out.println("The number of rs 50 notes is "+f);
		rupees=rupees%50;
		
		int tw=rupees/20;
		System.out.println("The number of rs 20 notes is "+tw);
		rupees=rupees%20;
		
		int tn=rupees/100;
		System.out.println("The number of rs 10 notes is "+tn);
		rupees=rupees%10;
		
		int fv=rupees/5;
		System.out.println("The number of rs 5 notes is "+fv);
		rupees=rupees%5;
		
		int to=rupees/2;
		System.out.println("The number of rs 2 coin is "+to);
		rupees=rupees%2;
		
		System.out.println("The number of rs 1 coin is "+rupees);
	}

}
