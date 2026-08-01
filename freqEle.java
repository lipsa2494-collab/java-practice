public class freqEle {
    public static void main(String args[]){
        int arr[]={10,20,50,20,10,89,61,89,99,54,10,40,99};
        int n=arr.length;
        int visited[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==1){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(arr[i]+"="+count);
        }

    }
    
}
