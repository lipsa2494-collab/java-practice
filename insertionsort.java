public class insertionsort {
    public static void main(String[] args) {
        int arr[]={25,45,95,75,55};
        for (int i=0;i<arr.length;i++){
            int x=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
        System.out.println("Sorted array in ascending order :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
          
        }
    }
}
    

