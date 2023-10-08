public class pattern6 {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }

    public static int bincof(int a,int b){
        int facOFn=factorial(a);
        int facOFr=factorial(b);
        int facOFnmr=factorial(a-b);
        return facOFn/(facOFr*facOFnmr);
    }
    public static void prntptrn6(int n){
        
        for(int i=1;i<=n;i++){
            int totspc=n-i;
            for(int spc=0;spc<totspc;spc++){
                System.out.print(" ");
            }
            if(i>1){System.out.print("1 ");}
            for(int j=1;j<=i;j++){
                if(i==1&&j==1){
                    System.out.print(" 1");
                    continue;
                }
                System.out.print(bincof(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int x=10;
        prntptrn6(x);
    }
}
