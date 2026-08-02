package midsem2;
abstract class Flower{
	void rose() {
		System.out.println("Rose is so beautiful");
	}
	abstract void jasmine();
	abstract void Marigold();
}
class whiteFlower extends Flower{
	void jasmine() {
		System.out.println("Jasmine smells nice");
	}
	void Marigold() {
		System.out.println("Mainly available in winter season");
	}
}
public class AbstractClass01 {
	public static void main(String[] args) {
		Flower w=new whiteFlower();
        w.rose();
        w.jasmine();
        w.Marigold();
	}

}
