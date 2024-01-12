public class rainwater3 {
    public static int lftmax(int[] arry,int x){
        int big=0;
        if(x==0){
            return arry[x];
        }else{
            for(int i=0;i<=x;i++){
                if(arry[i]>big){
                    big=arry[i];
                }
            }
        }
        return big;
    }

    public static int rhtmax(int[] arry,int x){
        int big=0;
        if(x==arry.length-1){
            return arry[x];
        }else{
            for(int i=x;i<arry.length;i++){
                if(big<arry[i]){
                    big=arry[i];
                }
            }
        }
        return big;
    }
    public static int rainwater(int[] arry){
        int totvol=0;
        for(int i=0;i<arry.length;i++){
        int lft=lftmax(arry,i);
        int rht=rhtmax(arry,i);
        int height=Math.min(lft, rht);
        int vol=height-arry[i];
        totvol+=vol;
    }
    return totvol;
}
    public static void main (String[] args){
        int[] arry={2,4,1,6,8,3,4,9,0,5};
        System.out.println(rainwater(arry));
    }
}   

