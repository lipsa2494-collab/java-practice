import java.util.Scanner;

public class diamond {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        

        for(int i=1;i<=r;i++){
            
            for (int k=i;k<r;k++) {
                    System.out.print(" ");
                }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
             System.out.println();
        }
            for(int i=r-1;i>=1;i--){
            for (int j=1;j<=i;j++) {
                System.out.println(" ");
            }
            for (int k=1;k<=(2*i)+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }                     
        }       
}
