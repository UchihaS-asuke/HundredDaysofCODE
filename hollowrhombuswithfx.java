public class hollowrhombuswithfx {
    public static void holormbs(int n){
        for(int i=1;i<=n;i++){
            int totspc=n-i;
            for(int spc=1;spc<=totspc;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                
                if (i != 1 && i != n && j != 1 && j != n) {

                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        holormbs(n);
    }
}
