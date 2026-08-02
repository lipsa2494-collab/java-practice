package practice;
public class InstantStatic {
static {
	System.out.println("Static block-1 created");
}
static {
	System.out.println("Static block-2 created");
}
{
	System.out.println("Instance block-1 created");
}
{
	System.out.println("Instance block-2 created");
}
InstantStatic(){
	System.out.println("Constructor-1 created");
}
InstantStatic(int x){
	System.out.println("constructor-2 created");
}
	public static void main(String[] args) {
		InstantStatic i=new InstantStatic();
		InstantStatic i1=new InstantStatic(5);

	}

}
