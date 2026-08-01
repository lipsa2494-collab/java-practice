import java.util.Arrays;
public class sortChar {
    public static void main(String args[]){
        String str="programming";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String str2=new String(ch);

        System.out.println(str2);
    }
    
}
