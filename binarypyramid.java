public class binarypyramid{
    public static void binprmd(int n){
        boolean x=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int y;
                if(x){y=1;}else{y=0;}
                System.out.print(y+" ");
                x=!(x);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        binprmd(n);
    }
}