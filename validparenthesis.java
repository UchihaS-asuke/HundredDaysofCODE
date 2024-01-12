import java.util.Scanner;

public class validparenthesis {
    public static boolean prnthsis(String intro){
    if(intro.charAt(0)=='[' && intro.charAt(intro.length()-1)==']'){
    return true;
}
return false;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String intro=sc.nextLine();
        System.out.println(prnthsis(intro));
        sc.close();
    }
}
