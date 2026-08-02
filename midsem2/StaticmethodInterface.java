package midsem2;
interface I1{
	static void I2() {
		System.out.println("Inside class I2");
	}
}
class C1 implements I1{
	void I2() {
		I1.I2();
		System.out.println("Inside I2 of class c1");
	}
}
public class StaticmethodInterface {
       public static void main(String args[]) {
    	  C1 o=new C1();
    	  o.I2();
       }
}
