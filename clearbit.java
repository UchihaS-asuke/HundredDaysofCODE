public class clearbit {
    public static void clrbt(int a,int b){
        int bitmask=~(1<<b);
        a=(bitmask&a);
        System.out.println(a);
    }
    public static void main(String[] args){
        int a=4;
        clrbt(a,2);
    }
}
