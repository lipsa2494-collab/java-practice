package prog1;

public class assignment05 {

	public static void main(String[] args) {
		double r=7;
		float l=32;
		float b=18;
		double base=15;
		int height=24;
		System.out.println("Area of the circle is: "+Area(r));
		System.out.println("Area of rectangle is:"+Area(l,b));
		System.out.println("Area of triangle is:"+Area(base,height));
		
		
	}
	public static double Area(double r) {
		return 3.14*r*r;
	}
	public static float Area(float l,float b) {
		return l*b;
	}
	public static double Area(double base,int height) {
		return 0.5*base*height;
				
	}

}
