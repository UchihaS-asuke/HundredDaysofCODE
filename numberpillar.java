/*
 1111111
 1111122
 1111333
 1114444
 1155555
 1666666
 7777777
 */

public class numberpillar {
    public static void prntpillar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("1");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=7;
        prntpillar(n);
    }
}
