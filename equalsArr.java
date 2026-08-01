import java.util.Arrays;
public class equalsArr {
    public static void main(String args[]){
        int[]A={18,48,93,68,10};
        int[]B={18,48,93,68,10};
        boolean flag=Arrays.equals(A,B);
        if(flag==true){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }

    }
    
}
