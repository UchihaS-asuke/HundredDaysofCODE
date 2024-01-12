public class insertionsort2 {
    public static void incsnsrt(int[] arry,int l){
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
        int[] arry={7,-2,4,0,3};
        int l=arry.length;
        incsnsrt(arry,l);
        for(int i=0;i<l;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
