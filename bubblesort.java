import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []A=new int[10];
        System.out.println("Enter elements in array:");
        for(int i=0;i<10;i++){
        A[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j=0;j<10;j++){
                if (A[i]>A[j]) {
                    int temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }

            }
        }
        for(int i=A.length-1;i>0;i--){
            System.out.print(A[i]+" ");
        }
    }

    }
    

