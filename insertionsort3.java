public class insertionsort3 {
    public static void insrt(int[] arry){
        int l=arry.length;
        for(int i=1;i<l;i++){
            int curr=arry[i];
            int prev=i-1;
            while(prev>=0&&curr<arry[prev]){
                arry[prev+1]=arry[prev];
                prev--;
            }
            arry[prev+1]=curr;
        }
    }
    public static void main(String[] args){
        int[] arry={4,2,-1,7};
        insrt(arry);
        for(int i=0;i<arry.length;i++){
        System.out.print(arry[i]+" ");
        }
    }
}
