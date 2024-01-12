import java.util.Arrays;

public class anagramcheck {
    public static boolean anagrm(String str1, String str2){
        int[] word1=new int[26];
        int[] word2=new int[26];
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            word1[ch-97]+=1;
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            word2[ch-97]+=1;
        }
        return Arrays.equals(word1, word2);
    }
    public static void main(String[] args){
       String str1="hammza";//Don't work on capital letters
       String str2="zammha";
       System.out.println(anagrm(str1,str2));
    }
}
