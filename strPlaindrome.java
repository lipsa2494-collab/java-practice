public class strPlaindrome {
    public static void main(String args[]){
        String str="Level";
        str=str.toLowerCase();
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i); 
            rev+=ch;
        }
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
