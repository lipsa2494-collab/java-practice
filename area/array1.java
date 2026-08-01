// import java.util.Scanner;
// public class array1 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int A[]=new int[10];
//         System.out.println("Enter the elements to array:");
//         for (int i = 0; i < 10; i++) {
//             A[i]=sc.nextInt();           
//         }
//         System.out.println("you entered:");
//         for(int i=0;i<10;i++){
//             System.out.print(A[i]);

//         }
//     }
// }

import java.util.Scanner;
public class array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        boolean flag=false;
        System.out.println("Enter the elements to array:");
        for (int i = 0; i < 10; i++) {
            A[i]=sc.nextInt();           
        }
        System.out.print("Enter the element to search:");
        int search=sc.nextInt();
        int pos=-1;
        for (int i = 0; i < 10; i++) {
            if (A[i]==search){
                pos=i;
                break;
            }      
            }    
        if (pos!=-1) {
            System.out.print("found at"+pos);
        }
        else{
            System.out.println("not found");
        }
        }
    }
    
