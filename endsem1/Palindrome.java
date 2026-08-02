package endsem1;

public class Palindrome {

	public static void main(String[] args) {
		String S="Ljevel";
		S=S.toLowerCase();
		String rev="";
		for(int i=S.length()-1;i>=0;i--) {
			rev+=S.charAt(i);
		}
		System.out.println("The reversed string is"+rev);
	
	if(S.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}

}
}