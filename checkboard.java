import java.util.Scanner;
public class checkboard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c=sc.nextInt();
        System.out.println("Enter 1st character:");
        char f=sc.next().charAt(0);
        System.out.println("Enter the secon character:");
        char l=sc.next().charAt(0);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(((i+j)%2==0) ? f:l);
                System.out.print(" ");
            }
            System.out.println();
        }



    }

    
}
