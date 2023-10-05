public class sumofdigitswithfx {
    public static int sumofdig(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        int x=1122335;
        System.out.println(sumofdig(x));
    }
}
