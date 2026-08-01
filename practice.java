import java.util.Scanner;
public class practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        int c=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");               
            }                
            for(int k=1;k<=i;k++) {
                System.out.print(c);
                c++;
            }       
            System.out.println();
        // }

        int x=5,y=6;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(~x);
		System.out.println(~y);
		System.out.println(-9<<2);
		System.out.println(-9>>2);
		}
	}
}