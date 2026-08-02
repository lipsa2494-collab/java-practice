package midsem2;
interface DefaultMethod{
	default void M() {
		System.out.println("Inside defaultMethod Interface");
	}final int a=9;   //  by default final
	String p(String q);
	default String G(String b) {
		return b;
	}
	void T();
}
class XYZ implements DefaultMethod{
	public String p(String l) {
		return l;
	}
	public void T() {
		System.out.println("Under class XYZ");
	}
	public void M() {
		System.out.println("Inside XYZ class");
	}
	public String G(String n) {
		return n;
	}
	
}
public class Interface02 {

}
