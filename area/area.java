import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1-Circle"+"\n 2-Rectangle"+ "\n 3-Triangle");
		int fig=sc.nextInt();
		
		switch(fig) {
		case 1:
			System.out.println("Enter radius:");
			double r=sc.nextDouble();
			System.out.println("Area of circle is "+(3.14*r));
			break;
			
		case 2:
			System.out.println("Enter length:");
			double l=sc.nextDouble();
			System.out.println("Enter breadth:");
			double b=sc.nextDouble();
			System.out.println("Area of Rectangle is "+(l*b));
			break;
			
		case 3:
			System.out.println("Enter base:");
			double i=sc.nextDouble();
			System.out.println("Enter height");
			double h=sc.nextDouble();
			System.out.println("Area of Triangle is "+(1/2 *i*h));
			break;
			
		default:
			System.out.println("your choice is error");
		}
		
		
		// TODO Auto-generated method stub

	}

}

    

