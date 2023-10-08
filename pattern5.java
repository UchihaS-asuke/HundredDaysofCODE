public class pattern5 {
    public static void prntptrn5(int n){
        for(int i=1;i<=n;i++){
            int totspc=n-i;
            for(int spc=1;spc<=totspc;spc++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        int x=5;
        prntptrn5(x);
    }
}
