public class getbit {
    public static void gtbt(int a,int b){
        int bitmask=1<<b;
        if((bitmask&a)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args){
        int a=5;
        gtbt(a,1);
    }
}
