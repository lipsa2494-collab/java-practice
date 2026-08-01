import java.util.Scanner;
public class function1 {
    public static void main(String [] args) {      
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter a number: ") ;
        int n=sc.nextInt();
        System.out.println("the number is "+find_prime(n));       
    }
    public static String find_prime(int x) {
        if (x<=-1) {
            return "not prime";
        }
        int count=0;
        for (int i=2;i<=x/2;i++) {
            if (x % i==0) {
                count+=1;           
            }
        }
        if (count==0)
            return "prime";    
        else
            return "not prime"; 
    }
    
}
