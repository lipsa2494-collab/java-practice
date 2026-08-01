public class powerfunction {
    public static void main(String args[]){
        int a=8;
        int b=3;
        power(a,b);
    }
    public static void power(int a,int b){
        int r=1;
        for(int i=1;i<=b;i++){
           r*=a;
        }
        System.out.println(r);
    }
}
