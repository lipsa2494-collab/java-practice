package midsem2;
interface  Student{
	void display();
	int x=10;
	final String m="ITER";
	public abstract void view() ;
}
class Test implements Student{
	public void view() {
		System.out.println("No of students");
	}
	public void display(){
		System.out.println("Inside Test class");
	}
}
interface Teacher extends Student{
	void sound();
	final String p=m;
}
public class Interface01 {
	public static void main(String[] args) {
		Test t=new Test();
		t.display();
		t.view();
	}
}
