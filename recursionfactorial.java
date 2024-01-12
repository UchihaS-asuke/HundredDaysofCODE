public class recursionfactorial {
    public static int factorial(int a){
        int fac;
        if(a==0||a==1){
            return 1;
        }
        fac=a*factorial(a-1);
        return fac;
    }
    public static void main(String[] args){
        int a=6;
        System.out.println(factorial(a));
    }
}
