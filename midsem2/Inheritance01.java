package midsem2;
class RoomArea{
	int length;
	int breadth;
	RoomArea(int l,int b){
		length=l;
		breadth=b;
	}
	void Area() {
		System.out.println(length*breadth);
	}
}
class RoomVolume extends RoomArea {
	int height;
	RoomVolume(int l,int b,int h){
		super(l,b);
		height=h;
	}
     int volume() {
    	 return length*breadth*height;
     }
}
public class Inheritance01 {
	public static void main(String[] args) {
		RoomArea r1=new RoomArea(8,9);
		r1.Area();
		RoomVolume r2=new RoomVolume(9,5,2);
		System.out.println(r2.volume());
	}

}
