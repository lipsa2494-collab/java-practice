package midsem2;
class Square{
	int side;
	Square(int s){
		side=s;
	}
	int perimeter(){
		return 4*side;
	}
}
public class Constructor01 {
	public static void main(String[] args) {
		Square sq=new Square(6);
		System.out.println(sq.perimeter());

	}

}
