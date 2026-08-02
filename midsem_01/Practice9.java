package midsem_01;
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two number:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Enter your cboice of operation:");
      char ch=sc.next().charAt(0);
      switch (ch) {
      case '+':
    	  System.out.println("Addition:"+(a+b));
    	  break;
      case '-':
    	  System.out.println("Subtraction"+(a-b));
    	  break;
      case '*':
    	  System.out.println("Multiplication"+(a*b));
    	  break;

      case '/':
    	  System.out.println("Division"+(a/b));
    	  break;

      case '%':
    	  System.out.println("Modulo"+(a%b));
    	  break;
//      System.out.println("Enter the grade:");
//      char c=sc.next().toUpperCase().charAt(0);
//      switch (c) {
//      case 'A':
//    	  System.out.println("Excellent");
//    	  break;
//      case 'b':
//    	  	System.out.println("good");
//    	  	break;
//      case 'c':
//  	  	System.out.println("Average");
//  	  	break;
//      case 'd':
//  	  	System.out.println("pass");
//  	  	break;
//      case 'e':
//  	  	System.out.println("fail");
//  	  	break;
//      default:
//  	  	System.out.println("Invalid grade");
//  	  	
//  	  	
//    	
//    	  
//    	  
//      }
      
      }    

      }
	}


