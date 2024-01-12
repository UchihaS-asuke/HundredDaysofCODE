public class bubblesort2{
    public static int[] bblsrt(int[] arry){
        int l=arry.length;
        for(int i=1;i<l;i++){
            for(int j=l-1;j>0;j--){
                if(arry[j-1]>arry[j]){
                    int temp=arry[j];
                    arry[j]=arry[j-1];
                    arry[j-1]=temp;
                }
            }
        }
        return arry;
    }
    public static void main(String[] args){
        int[] arry={5,3,7,1,9,2,23,7,15,0,27,2,7,2,4,3,2,2,13};
        bblsrt(arry);
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
}