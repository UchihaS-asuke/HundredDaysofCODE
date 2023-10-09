public class fibonacciwithfx{
    public static void fibonaci(int n){
       int a=1;
       int b=1;
       int c=2;
       for(int i=0;i<n;i++){
        System.out.print(a+" ");
        a=b;
        b=c;
        c=a+b;
       }
    }
    public static void main(String[] args){
        int x=10;
        fibonaci(x);
    }
}