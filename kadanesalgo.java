public class kadanesalgo {
    public static int kadane(int[] arry){
        int l=arry.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            cs+=arry[i];
            if(cs<0){cs=0;}
            ms=Math.max(ms, cs);
        }
        return ms;
    }
    public static void main(String[] args){
        int[] arry={-3,8,2,-7,1,5,9};
        System.out.println(kadane(arry));
    }
}
