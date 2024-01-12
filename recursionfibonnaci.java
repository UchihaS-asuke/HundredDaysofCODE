public class recursionfibonnaci {
    public static int fibonnaci(int x){
        if(x==0||x==1){
            return x;
        }
        return fibonnaci(x-1)+fibonnaci(x-2);
    }
    public static void main(String[] args){
        int x=7;
        System.out.println(fibonnaci(x));
    }
}
