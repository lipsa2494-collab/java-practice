package practice;
interface myInterface{
	void show();
	default void display() {
		System.out.println("Inside display method of myInterface");
	}
	static void get() {
		System.out.println("Inside get method of myInterface");
	}
}
class newClass implements myInterface{
	public void show() {
		System.out.println("Inside show of newClass");
	}
	public void display() {        //default  keyword can only be used inside the interface
		System.out.println("Inside display method of newClass");
	}
	
	public void get() {
		System.out.println("Inside get method of newClass");
	}
}
public class InterfaceI {
	public static void main(String[] args) {
		newClass n=new newClass();
		n.display();
		n.get();
		n.show();

	}

}
