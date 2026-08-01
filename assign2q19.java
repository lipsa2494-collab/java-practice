import java.util.Scanner;
public class assign2q19 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        double m=sc.nextDouble();
        int category=0;
        if (m>90 && m<=100) {
             category = 1;
        
        }
        else if (m>80 && m<=90) {
             category = 2;
        }
        else if (m>70 && m<=80) {
             category = 3;
        }
        else if (m>60 && m<=70) {
             category = 4;
        }
        else if(m>50 && m<=60) {
             category = 5;
        }
        else if (m<40) {
             category = 6;
        }
        switch (category) {
          case 1:
               System.out.println("O");
               break;
          case 2:
               System.out.println("A");
               break;
          case 3:
               System.out.println("B");
               break;
          case 4:
               System.out.println("C");
               break;
          case 5:
               System.out.println("D");
               break;
          case 6:
               System.out.println("F");
               break;      
          default:
               System.out.println("User has entered invalid marks");
        }
        

        
    }
    
}
