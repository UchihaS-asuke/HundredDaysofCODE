public class recursionoptimisedpower {
    public static float optpow(int b,int p){
        if(p==1){
            return b;
        }
        float halfpow=optpow(b,p/2);
        if(p%2==0){
             return halfpow*halfpow;
        }else{
            return b*halfpow*halfpow;
        }
    }
    public static void main(String[] args){
        int base=3;
        int powr=7;
        System.out.println(optpow(base,powr));
    }
}
