import java.util.Scanner;
public class maxnumbstr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the element:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        System.out.println("Enter the elements to the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];

        for(int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max element in the array is "+max);

        

        }
    }
    

