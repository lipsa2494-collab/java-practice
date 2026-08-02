package midsem2;
sealed class Shape permits Circle{
	void display() {
		System.out.println("Inside shape");
	}
	void show() {
		System.out.println("Shape varies");
	}
}
class Oval{
	
}
sealed class Circle extends Shape permits redCircle{
	void display() {
		System.out.println("Insice circle");
	}
	
}
final class redCircle extends Circle{
	void display() {
		System.out.println("Inside redCircle");
	}
}

public class SealedClass01 {
	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.display();
		Shape s2=new Circle();
		s2.display();
		Circle c1=new Circle();
		c1.display();
		Shape s3=new redCircle();
		s3.display();
		Circle c2=new redCircle();
		c2.display();
		redCircle c3=new redCircle();
		c3.display();
	}
}
