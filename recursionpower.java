public class recursionpower {
    public static float recpow(int base,int powr){
        if(powr==0){
            return 1;
        }
        return base*recpow(base, (powr-1));
    }
    public static void main(String[] args){
        int b=5;
        int p=3;
        System.out.println(recpow(b,p));
    }
}
