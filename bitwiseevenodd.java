public class bitwiseevenodd {
    public static void bitoddevn(int a){
        int bitmask=1;
        if((a&bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        int a=5;
        bitoddevn(a);
    }
}
