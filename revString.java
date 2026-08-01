import java.util.Scanner;
public class revString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        char []s=str.toCharArray();
        // String rev="";
        // for (int i=str.length()-1;i>=0;i--) {
        //     rev+=str.charAt(i);
        // }
        // System.out.println(rev);
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            char temp;
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        


    }
    
}
