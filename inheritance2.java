class person2{
	String name;
	int age;
	void set(String n, int a) {
		name=n;
		age=a;
	}
	void get() {
		System.out.println("Name: "+name+" age:"+ age);
	}
}
class Student2 extends person2{
	String roll;
	Double mark;
	String branch;
	
	void set(String n,int a,String r,Double m,String b) {
		super.set(n,a);		
		roll=r;
		mark=m;
		branch=b;			
	}
	void get() {
		super.get();
		System.out.println("Roll: "+roll+" mark: "+mark+" branch:"+branch);
	}
}

public class inheritance2{
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.set("Lipsa",22,"A28",90.01,"MCA");
		s1.get();
		
	}

}
