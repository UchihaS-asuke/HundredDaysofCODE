public class kadanesalog {
    public static void kadane(int[] arry){
        int l=arry.length;
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<l;i++){
            currsum+=arry[i];
            if(currsum<0){currsum=0;}
            maxsum=Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args){
        int[] arry={-3,8,2,-7,1,5,9};
        kadane(arry);
    }
}
