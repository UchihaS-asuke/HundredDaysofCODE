public class sumofdigits {
    public static int sum(int a){
        int summ=0;
        while(a>0){
            int rem=a%10;
            summ+=rem;
            a/=10;
        }
        return summ;
    }
    public static void main(String[] args){
        int a=67345;
        System.out.println(sum(a));
    }
}
