public class invnrotnhalfpyramid {
    public static void invrothalfpyrmd(int n){
        for(int i=1;i<=n;i++){
            int totspc=n-i;
            for(int spc=0;spc<totspc;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       int n=5;
       invrothalfpyrmd(n);
    }
}
