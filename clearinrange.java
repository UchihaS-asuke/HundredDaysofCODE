
public class clearinrange {
    public static void clrinrng(int a,int b,int c){
        int btmask=-1<<c+1;
        int bitmsk=(1<<b)-1;
        int bitmask=(btmask|bitmsk);
        a=bitmask&a;
        System.out.println(a);//35
    }
    public static void main(String[] args){
        int a=63;
        clrinrng(a,2,4);
    }
}
