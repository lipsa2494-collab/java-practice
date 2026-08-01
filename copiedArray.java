import java.util.Scanner;
public class copiedArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the element:");
        int n=sc.nextInt();
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        System.out.println("Enter elements of the array:");
        for (int i=0;i<arr1.length;i++) {
            arr1[i]=sc.nextInt();

        }
        System.out.println("The original arr is ");
        for (int i=0;i<n;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        
        for (int i=0;i<n;i++) {
            arr2[i]=arr1[i];
        }
        System.out.println("The copied array is ");
        for (int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

    }
    
}
