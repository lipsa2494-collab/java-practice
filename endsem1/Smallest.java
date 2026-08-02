package endsem1;

public class Smallest {

	public static void main(String[] args) {
		int a=25;
		int b=45;
		int c=89;
		int d=12;
		int e=23;
		int smallest=a;
		if (smallest>b) {
			smallest=b;
		}
		if(smallest>c) {
			smallest=c;
		}
		if (smallest>d) {
			smallest=d;
		}
		if(smallest>e) {
			smallest=e;
		}
     System.out.println("smallest number: "+smallest);
     }

}
