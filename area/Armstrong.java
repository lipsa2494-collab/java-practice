import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=n;
        int d;
        int sum=0;
        while(n>0){
            d=n%10;
            sum+=(d*d*d);
            n/=10;
        }
        if(sum==a){
            System.out.println(a+" is an Armstrong number");
        }
        else {
            System.out.println(a+" is not an Armstrong number");
        }

    }
    
}
