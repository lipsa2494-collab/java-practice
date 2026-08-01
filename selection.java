import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={45,69,78,32,90};
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array in ascending order :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
