public class palindromewithfx {
    public static int count(int a){
        int count=0;
        while(a>0){
            a/=10;
            count++;
        }
        return count;
    }
    public static int reverse(int a){
        int revs=0;
        int pow=count(a)-1;
        while(a>0){
            int rem=a%10;
            revs=revs+rem*(int)Math.pow(10,pow);
            a/=10;
            pow--;
        }
        return revs;
    }
    public static boolean palindrome(int a){
    int revs=reverse(a);
    return (a==revs);
    }
    public static void main(String[] args){
        int x=745347;
        System.out.println(palindrome(x));
    }
}
