package midsem2;
class Room{
	int length;
	int breadth;
	Room(int l,int b){
		length=l;
		breadth=b;
	}
	Room(int x){
		length=breadth=x;
	}
	int area() {
		return length*breadth;
	}
}
public class OverLoading {
	public static void main(String[] args) {
		Room r1=new Room(20,10);
		Room r2=new Room(40);
		System.out.println(r1.area());
		System.out.println(r2.area());
	}

}
