public class checkifpowoftwo {
    public static boolean powof2(int a){
        int bitmask=a-1;
        if((a&bitmask)==0){
            return true;
        }else{
            return false;
        }
}
    public static void main(String[] args){
        int a=32;
        System.out.println(powof2(a));
    }
}
