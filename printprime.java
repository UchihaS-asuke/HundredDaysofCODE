public class printprime {
    public static boolean ifprime(int n){
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                 return false;                    
                }
            }
            return true;
        }
    }
    public static void prntprim(int n){
        for(int i=2;i<=n;i++){
            if(ifprime(i)){
                System.out.print(i+"  ");
            }
        }
    }
    public static void main(String[] args){
        int n=50;
        prntprim(n);
    }
}
