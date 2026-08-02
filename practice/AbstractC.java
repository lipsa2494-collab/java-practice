package practice;
abstract class Animal{
	abstract void Show();
	void display() {
		System.out.println("Inside display of Animal");
	}
}
class Dog extends  Animal{
	public void Show() {
		System.out.println("Dog barks");
	}
}
class Lion extends Animal{
	public void Show() {
		System.out.println("Lion rears");
	}
	void display() {
		System.out.println("Inside lion class");
	}
	void Eat() {
		System.out.println("Lion eats flesh");
	}
}
abstract class StreetDog extends Dog{
	public abstract void drink();
	public void Show() {
		System.out.println("StreetDog runs fast");
	}
	
}
public class AbstractC {
	public static void main(String[] args) {
		Dog s=new Dog();
		s.Show();
		
		

	}

}
