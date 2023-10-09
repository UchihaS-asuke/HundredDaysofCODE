public class factorialwithrecursion {
    public static int facrec(int n){
        if(n==1){
            return 1;
        }
        return n*facrec(n-1);
    }
    public static void main(String[] args){
        int x=6;
        System.out.println(facrec(x));
    }
}
