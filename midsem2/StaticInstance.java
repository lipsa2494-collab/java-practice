package midsem2;
public class StaticInstance {
	{
		System.out.println("Instance-1 executed");
	}
	void display(){
		System.out.println("Static instance block");
	}
	{
		System.out.println("Instance block-2 executed");
	}
	static {
		System.out.println("Static block-1 executed");
	}
	static {
		System.out.println("static block-2 executed");
	}
	StaticInstance(){
		System.out.println("Constructor-1 executed");
	}
	StaticInstance(int x){
		System.out.println("Constructor-2 executed");
	}
	public static void main(String[] args) {
		StaticInstance s1=new StaticInstance();
		s1.display();
		StaticInstance s2=new StaticInstance(5);
		
		s2.display();
	}

}
