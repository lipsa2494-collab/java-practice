package midsem2;
class CustomException extends Exception{
	CustomException(String m){
		super(m);
	}
}
public class Exception6 {
	static void test(int m) throws CustomException{
		if (m<0 ||m>100) {
			throw new CustomException("Invalid Mark");
		}
		else {
			System.out.println("Mark: "+m);
		}
	}
	public static void main(String[] args) {
		try {
			test(1002);
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}

	}

}
