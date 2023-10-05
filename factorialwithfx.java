public class factorialwithfx {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
    int x=6;
    System.out.println(factorial(x));    
    }
}
