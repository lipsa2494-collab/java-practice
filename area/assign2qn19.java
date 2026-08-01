import java.util.Scanner;
public class assign2qn19 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int m=sc.nextInt();
        if(m<=0 && m>=100) {
                switch(m/10) {
                    case 9, 10 :
                    System.out.println("O");
                    break;

                    case 7,8 :
                    System.out.println("A");
                    break;

                    case 5,6 :
                    System.out.println("B");
                    break;

                    default:
                    System.out.println("F");

                }
            }
            
        }


    }

    
    

