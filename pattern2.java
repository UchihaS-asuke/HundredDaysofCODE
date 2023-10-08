public class pattern2 {
    public static void prntptrn2(int n){
        for(int i=1;i<=n;i++){
            int count=i;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count=count+(n-j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int x=5;
        prntptrn2(x);
    }
}
