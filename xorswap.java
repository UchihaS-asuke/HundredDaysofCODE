public class xorswap{
    public static void zorswap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        int a=5;
        int b=11;
        System.out.println(a+" "+b);
        zorswap(a,b);
    }
}