public class prefixsumsubarry {
    public static void prfxsbary(int[] arry){
        int l=arry.length;
        int[] prefix=new int[l];
        prefix[0]=arry[0];
        for(int i=1;i<l;i++){
            prefix[i]=arry[i]+prefix[i-1];
        }
        int sum=0;
        int maxsum=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                sum=(i==0)?arry[i]:prefix[j]-prefix[i];
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args){
        int[] arry={3,1,-4,6,8,2,0,5};
        prfxsbary(arry);
    }
}
