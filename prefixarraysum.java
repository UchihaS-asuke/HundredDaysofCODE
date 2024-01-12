public class prefixarraysum {
    public static int prefixsum(int[] arry){
        int l=arry.length;
        int maxsum=0;
        int[] prefix=new int[l];
        prefix[0]=arry[0];
        for(int i=1;i<l;i++){
            prefix[i]=prefix[i-1]+arry[i];
        }
        for(int i=0;i<l;i++){
            int subsum=0;
            for(int j=i;j<l;j++){
                subsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(subsum>maxsum){
                    maxsum=subsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arry={3,1,-4,6,8,2,0,5};
        System.out.println(prefixsum(arry));
    }
}
