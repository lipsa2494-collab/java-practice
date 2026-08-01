public class substring {
    public static void main( String args[]) {
        String str="ITER COLLEGE";
        int start=3;
        int end=8;
        String substr="";
        for (int i=start;i<end;i++){
            substr+=str.charAt(i);
        }
        System.out.println("Extracted substring is :"+substr);

    }
    
}
