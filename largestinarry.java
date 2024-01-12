public class largestinarry {
    public static void large(int[] arry){
        int big=Integer.MIN_VALUE;
        for(int i=0;i<arry.length;i++){
            if(arry[i]>big){
                big=arry[i];
            }
        }
        System.out.println(big);
    }
    public static void main(String[] args){
        int[] arry={4,-2,6,-5,11};
        large(arry);
    }
}
