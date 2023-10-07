public class pairsofarray {
    public static void prntpair(int[] arry){
        int l=arry.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l-1;j++){
                System.out.println("("+arry[i]+","+arry[j]+")");
            }
        }
    }
    public static void main(String[] args){
        int[] arry={2,4,6,8,10};
        prntpair(arry);

    }
}
