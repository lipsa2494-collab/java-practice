

public class pattristar {
    public static void main(String[] args) {
        for(int r=1;r<=3;r++)
        {
            for(int sp=1;sp<=(3-r);sp++)
             System.out.print(" ");
            for(int c=1;c<(2*r);c++)
             System.out.print("*");
            System.out.println();
        }
        for(int f=1;f<=2;f++)
        {
            for(int s=1;s<=f;s++)
             System.out.print(" ");
            for(int d=(2*f)-1;d<=3;d++)
             System.out.print("*");
            System.out.println();
            
        }
    }
}
