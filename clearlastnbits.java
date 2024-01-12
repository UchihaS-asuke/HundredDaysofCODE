public class clearlastnbits{
    public static void clrlstnbit(int a,int b){
        int bitmask=(-1<<b+1);//Because Index 0 has also to be shifted
        a=bitmask&a;
        System.out.println(a);//48
    }
    public static void main(String[] args){
        int a=63;
        clrlstnbit(a,3);
    }
}
