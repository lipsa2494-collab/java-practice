import java.util.Scanner;
public class ppt_class1 {
    public static void main(String args[]){
        String str, rev="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=s.nextLine();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("The reverse of the string is :"+rev);
        if(rev.equals(str)){
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }





    }
    
}
