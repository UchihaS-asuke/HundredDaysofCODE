public class recursionsumofnnum {
    public static int recsum(int a){
        if(a==1){
            return 1;
        }
        return a+recsum(a-1);
    }
    public static void main(String[] args){
        int a=10;
        System.out.println(recsum(a));
    }
}
