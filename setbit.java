public class setbit {
    public static void stbt(int a,int b){
        int bitmask=1<<b;
        a=(a|bitmask);
        System.out.println(a);
    }
    public static void main(String[] args){
        int a=5;
        stbt(a,1);
    }
}
