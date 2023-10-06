public class diamond {
    public static void dimnd(int n){
        for(int i=1;i<=2*n-1;i++){
            int totspc;
            if(i<=n){ totspc=n-i;
            }else{
                totspc=i-n;
            }
            for(int spc=1;spc<=totspc;spc++){
                System.out.print(" ");
            }
            int jmax;
            if(i<=n){
                jmax=i;
            }else{
                jmax=n-(i-n);
            }
            for(int j=1;j<=jmax;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int x=5;
        dimnd(x);
    }
}
