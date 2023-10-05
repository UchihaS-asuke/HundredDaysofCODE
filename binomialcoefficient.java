public class binomialcoefficient {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }

    public static void bincof(int a,int b){
        int facOFn=factorial(a);
        int facOFr=factorial(b);
        int facOFnmr=factorial(a-b);
        int finans=facOFn/(facOFr*facOFnmr);
        System.out.println(finans);
    }
    public static void main(String[] args){
        int n=7;
        int r=3;
        bincof(n,r);
    }
}
