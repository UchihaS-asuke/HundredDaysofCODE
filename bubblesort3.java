public class bubblesort3 {
    public static void bblsrt(int[] arry,int l){
        for(int i=0;i<l;i++){
            for(int j=1;j<l;j++){
                if(arry[j]<arry[j-1]){
                    int temp=arry[j];
                    arry[j]=arry[j-1];
                    arry[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arry={4,2,-1,9,0,7,5};
        int l=arry.length;
        bblsrt(arry,l);
        for(int i=0;i<l;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
