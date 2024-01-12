import java.util.*;
public class complexoperations {
    public static class Complex{
     void sum(int a,int c){
        int one=a%10;
        a/=100;
        int two=c%10;
        c/=100;
        System.out.println(a+c+"+"+(one+two)+"i");
    }
    void product(int a,int c){
        int one=a%10;
        a/=100;
        int two=c%10;
        c/=100;
        System.out.println(a*c-(one*two)+"+"+(a*two+(one*c))+"i");
    }
    void subtract(int a,int c){
        int one=a%10;
        a/=100;
        int two=c%10;
        c/=100;
        System.out.println((a-c)+"+"+(one-two)+"i");
    }
}
    public static void main(String[] args){
        int a;
        
        Scanner sc=new Scanner(System.in);
        Complex c1 = new Complex();
        

        System.out.println("Enter first number without i and use 0 for space");
        a=sc.nextInt();
        System.out.println("Enter second number without i and use 0 for space");
        int c;
        c=sc.nextInt();
        c1.sum(a, c);
        c1.product(a, c);
        c1.subtract(a, c);
        sc.close();
    }
}
