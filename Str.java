import java.util.Scanner;
public class Str {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string:");
       String s=sc.nextLine();

       for (int i=0;i<s.length();i++){
        System.out.print(s.charAt(i));
       }
}
}