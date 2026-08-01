public class Stringvowcon {
    public static void main(String args[]){
        String str="Java programming";
        str=str.toLowerCase();
        int n=str.length();
        int vow=0;
        int con=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if((ch>='a')&& (ch<='z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vow+=1;
                }
                else{
                    con+=1;
                }

            }

        }
        System.out.println("no of vowels:"+vow+"No of consonants:"+con);
    }
}
