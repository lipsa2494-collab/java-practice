import java.util.Scanner;
public class countwrd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if((i==0) || (s.charAt(i)!=' ') && (s.charAt(i-1)==' '))
                c++;
        }
        System.out.println("Number of words:"+c);
    }
}
