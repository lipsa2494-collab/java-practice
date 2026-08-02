package endsem1;

public class VowelConsonant {

	public static void main(String[] args) {
		String str="Java programming";
		str=str.toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v+=1;
				}
				else {
					c+=1;
				}
			}
			
			
	}
		System.out.println("No of vowels:"+v);
		System.out.println("No of consonants: "+c);
}
}
