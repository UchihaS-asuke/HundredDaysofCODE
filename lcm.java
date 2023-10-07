public class lcm{
    public static int lcmfx(int a,int b){
        int small=(a>b)?a:b;
        int comdiv=1;
        for(int i=2;i<=small;i++){
            if(a%i==0&&b%i==0){
                comdiv=i;
            }
        }
        a/=comdiv;
        b/=comdiv;
        return a*b*comdiv;
    }
    public static void main(String[] args){
        int a=17;
        int b=43;
        int ans=lcmfx(a,b);
        System.out.println(ans);
    }
}