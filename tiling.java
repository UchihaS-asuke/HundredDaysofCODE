public class tiling{
    public static int tilenum(int n){
        if(n==0||n==1){
            return 1;
        }
        int vrtcl=tilenum(n-1);
        int hrztl=tilenum(n-2);
        return vrtcl+hrztl;
    }
    public static void main(String[] args){
        int n=8;
        System.out.println(tilenum(n));
    }
}