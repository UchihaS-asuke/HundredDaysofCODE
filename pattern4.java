public class pattern4 {
    public static void prntptrn4(int n){
        for(int i=1;i<2*n;i++){
            int totspc=(i<=n)?i-1:2*n-i-1;
            int totj=(i<=n)?i:2*n-i;
            for(int spc=1;spc<=totspc;spc++){
                System.out.print(" ");
            }
            for(int j=totj;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int x=5;
        prntptrn4(x);
    }
}
