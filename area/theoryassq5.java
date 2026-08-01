import java.util.Scanner;
public class theoryassq5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();
        int d=x;
        int sum=0;
        int fact=1;
        while(x!=0) {
            int r=x%10;
            for(int i=r;i>1;i--){
                fact*=i;
                
            }
            sum+=fact;
            x/=10;
            fact=1;
        }
        if(sum==d) {
            System.out.println(d+" is a strong number.");
        }
        else {
            System.out.println(d+" is not a strong number");
        }
        

    }
    
}
