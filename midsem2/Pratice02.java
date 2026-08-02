package midsem2;
class Person02{
	String name;
	String regno;
	void set(String n,String r) {
		name=n;
		regno=r;
	}
	void get() {
		System.out.println("Name: "+name+" Reg no: "+regno);
	}
}
class Student02 extends Person02{
	String branch;
	Double mark;
	void set(String n,String r,String b,Double m) {
		super.set(n,r);
		branch=b;
		mark=m;
	}
	void get() {
		super.get();
		System.out.println("Branch: "+branch+" Mark: "+mark);
	}
}
public class Pratice02 {
	public static void main(String[] args) {
		Student02 s=new Student02();
		s.set("Rakesh","123","mca",89.9);
		s.get();
	}
}
