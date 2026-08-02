package practice;
sealed abstract class LivingBeings permits Animal1,Bird,Humans{
	public void display() {
		System.out.println("Inside display of class LivingBeings");
	}
	abstract void show();
}
sealed class Animal1 extends LivingBeings permits People{
	public void show() {
		System.out.println("Animal is derived from livingbeings");
	}
}
non-sealed class People extends Animal1{
	public void display() {
		System.out.println("Inside display of class people");
	}
	public void show() {
		System.out.println("people is derived from Animal");
	}
}
final class Bird extends LivingBeings{
	public void show() {
		System.out.println("Bird is a final class and can't be modified");
	}
}
non-sealed class Humans extends LivingBeings{
	public void show() {
		System.out.println("Human is derived from LivingBeings");
	}
}
public class SealedClass {
	public static void main(String[] args) {
		Bird b=new Bird();
		b.show();
		Humans h=new Humans();
		h.show();
		Animal1 a=new Animal1();
		a.show();
		Animal1 p=new People();
		p.display();
	}

}
