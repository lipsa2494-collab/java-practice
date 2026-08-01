import java.util.Scanner;
import java.util.Arrays;
public class sortingCharacters {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        char[]ch=str.toCharArray();
        Arrays.sort(ch);
        String sortedStr=new String(ch);
        System.out.println("Sorted string :"+sortedStr);
    }
    
}
