import java.util.Scanner;
public class theoryassq3 {
    public static void main(String args []) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a =sc.nextInt();
        System.out.print("Enter b:");
        int b =sc.nextInt();
        System.out.print("Enter c:");
        int c =sc.nextInt();

        int d=b*b - 4*a*c;
        double x=(-b + (Math.sqrt(d)))/2*a;
        double y=(-b - (Math.sqrt(d)))/2*a;

        if (d>0) {
            System.out.println("The roots of the quadratic equation is :"+x+y);
        }
        else if(d==0) {
            System.out.println("The roots of the quadratic equation is :"+x);
        }
        else {
            System.out.println("The quation has imaginary roots.");
        }

        



    }

    
}
