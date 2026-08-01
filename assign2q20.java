import java.util.Scanner;
public class assign2q20 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll no:");
        int r=sc.nextInt();

        if(r%10==0 || r%10==1 || r%10==2 || r%10==3) {
            System.out.println("Hall A");
        }
        else if (r%10==4 || r%10==5 || r%10==6) {
            System.out.println("Hall B");
        }
        else if( r%10==7 || r%10==8 || r%10==9) {
            System.out.println("Hall C");
        }

    }
    
}
