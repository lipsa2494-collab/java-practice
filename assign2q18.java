import java.util.Scanner;
public class assign2q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int z=sc.nextInt();

        if(z % 5 ==0) {
            System.out.println(z+ " is a multiple of 5");
        }
        else {
            System.out.println(z+ " is not a multiple of 5");
        }
        
    }

    
}
