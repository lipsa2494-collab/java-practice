import java.util.Scanner;
public class pattern {
    public static void main(String args []) {
        Scanner sc=new Scanner(System.in);
        int r=1,c=1;

        while(r<=3){
            while(c<=r) {
                System.out.print("*");
                c+=1;
            }
            r++;
            System.out.println();
            c=1;

        }

        
    }
}
