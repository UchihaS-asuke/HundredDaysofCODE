public class hcf {
    public static int hcffx(int a,int b){
        int small=(a>b)?b:a;
        int hcf=1;
        for(int i=2;i<=small;i++){
            if(a%i==0&&b%i==0){
                hcf=i;
            }

        }
        return hcf;
    }
    public static void main(String[] args){
        int a=25;
        int b=100;
        System.out.println(hcffx(a,b));
    }
}
