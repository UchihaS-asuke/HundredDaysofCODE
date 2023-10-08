public class pattern3 {
    public static void prntptrn3(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        int x=7;
        prntptrn3(x);
    }
}
