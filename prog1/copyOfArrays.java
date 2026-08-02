package prog1;
import java.util.Arrays;

public class copyOfArrays {

	public static void main(String[] args) {
		int[]A= {15,27,36,89,72};
		int[]B=Arrays.copyOf(A,A.length);
		System.out.println("Original array"+Arrays.toString(A));
		System.out.print("Copied array"+Arrays.toString(B));
		
		
		}
	}


