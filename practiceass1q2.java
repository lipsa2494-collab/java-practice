// public class practiceass1q2 {
//     public static void main(String [] args) {
//         int s=0;
//         for(int i =101; i<200; i++){
//             if(i % 7 ==0) {
//                 s+=i;
//             }
//         }
//         System.out.println("The sum of numbers divisible by 7 is " +s);

//     }
    

// }
import java.util.Scanner;
public class practiceass1q2 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("The even numbers are:");
        for(int i=1;i<n;i++) {
            if(i%2==0) {
                System.out.print(i+" ");
                }    
            }
            System.out.println();
        System.out.println("The odd numbers are:");
        for(int i=1;i<n;i++){
            if(i%2!=0) {
                System.out.print(i+" ");
            }
        }
        
    }
 }
