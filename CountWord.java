public class CountWord {
    public static void main(String args[]){
        String str="I am a student of ITER";
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)!=' ')&& (i==0 ||str.charAt(i-1)==' ')){
                count++;

            }
        }
        System.out.println("The no of words:"+count);
    }
    
}
