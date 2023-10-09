import java.util.*;
public class revsasntnc {
    public static StringBuilder sntncrevs(String abc){
        int l=abc.length();
        StringBuilder cba=new StringBuilder(abc);
        for(int i=0;i<=l/2;i++){
            char temp=cba.charAt(i);
            cba.setCharAt(i, cba.charAt(l-i-1));
            cba.setCharAt(l-i-1, temp);
        }
        return cba;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String intro=sc.nextLine();
        System.out.println(sntncrevs(intro));
        sc.close();
    }
}
