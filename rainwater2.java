public class rainwater2 {
    public static int minofmax(int[] array,int x){
        int rhtmax=array[x];
        for(int j=x;j<array.length;j++){
            if(array[j]>rhtmax){
                rhtmax=array[j];
            }
        }
        int lftmax=array[x];
        for(int k=x;k>=0;k--){
            if(array[k]>lftmax){
                lftmax=array[k];
            }
        }
        return Math.min(rhtmax, lftmax);
    }
    public static int watertrap2(int[] array){
        int l=array.length;
        int water=0;
        if(l<=2){
            return 0;
        }
        for(int i=0;i<l;i++){
            int height=minofmax(array,i);
            int tempwater=height-array[i];
            water+=tempwater; 
        }
        return water;
    }
    public static void main(String[] args){
        int[] array={3,5,0,2,6,3,7,6};
        int water=watertrap2(array);
        System.out.println(water);
    }
}
