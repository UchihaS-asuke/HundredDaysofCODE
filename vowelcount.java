public class vowelcount {
    public static int countvwl(String str){
        int count=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str="oreva bhardwaj sameer";
        System.out.println(countvwl(str));
    }
}
