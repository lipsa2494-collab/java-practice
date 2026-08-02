package midsem2;
class Rectangle{
	double length;
	int breadth;
	void getData(Double l,int b) {
		length=l;
		breadth=b;
	}
	double Area() {
		return length*breadth;
	}
}

public class Class_Object {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.getData(12.5, 6);
		r2.getData(18.5, 9);
		System.out.println(r1.Area());
		System.out.println(r2.Area());
	}

}
