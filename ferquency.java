public class ferquency {
    public static void main(String args[]) {
        int[] arr={10,20,10,30,40,20,10,50,40,50};
        System.out.println("Element frequency:");
        for (int i=0;i<arr.length ;i++) {
            if (arr[i]==-1) {
                continue;
            }
            int count=1;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+"        "+count);
        }   
    }   
}
