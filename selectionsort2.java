public class selectionsort2 {
    public static void slcsrt(int[] arry,int l){
        for(int i=0;i<l;i++){
            int start=i;
            for(int j=i+1;j<l;j++){
                if(arry[start]>arry[j]){
                    start=j;
                }
            }
            int temp=arry[start];
            arry[start]=arry[i];
            arry[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arry={4,2,-1,7,0,3,9};
        int l= arry.length;
        slcsrt(arry,l);
        for(int i=0;i<l;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
