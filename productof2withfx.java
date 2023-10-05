import java.util.*;
public class productof2withfx{
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=product(a,b);
        System.out.println(prod);
        sc.close();
    }
}