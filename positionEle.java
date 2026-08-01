public class positionEle {
    public static void main(String args[]){
        int []A={35,78,42,60,32};
        System.out.print(" even\nelements : "+" ");
        System.out.println("index");
        for (int i=0;i<A.length;i++){
            if(A[i] % 2==0) {
                System.out.print(A[i]+" ");
                System.out.println(i);
            }
        }
    }
    
}
