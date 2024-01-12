public class twopointerapproach {
    public static int twopointer(int[] arry){
        int lp=0;
        int maxwater=0;
        int rp=arry.length-1;
        while(lp<rp){
            int height=Math.min(arry[lp],arry[rp]);
            int width=rp-lp;
            int water=height*width;
            maxwater=Math.max(water,maxwater);
            if(arry[lp]>arry[rp]){
            rp--;
            }else{
                lp++;
            }
        }
        return maxwater;
    }
    public static void main(String[] args){
        int[] arry={1,8,6,2,5,4,8,3,7};
        System.out.println(twopointer(arry));
    }
}
