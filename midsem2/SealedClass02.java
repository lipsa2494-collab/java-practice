package midsem2;
sealed class Exam permits Internal,External{
	
}
non-sealed class Internal extends Exam{
	
}
sealed class External extends Exam permits labTest,TheoryTest {
	{
}
	
}
final class labTest extends External{
	
}
final class TheoryTest extends External{
	
}

public class SealedClass02 {

	public static void main(String[] args) {
		

	}

}
