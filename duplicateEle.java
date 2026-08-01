public class duplicateEle {
    public static void main(String args[]){
        int arr[]={10,60,55,90,10,56,34,20,50,10,40,60};
        int n=arr.length;
        for(int i=0;i<n;i++){
            Boolean is_dupli=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    is_dupli=true;
                    break;
                }
            }
            if(is_dupli==false){
                System.out.print(arr[i]+" ");
                

                }
            }
        }

    }
    

