public class primeornot {
    public static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=3;
        if(prime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
