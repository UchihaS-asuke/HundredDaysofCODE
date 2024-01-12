public class bubblesort4 {
    public static void bblsrt(int[] arry){
        int l=arry.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arry[i]>arry[j]){
                    int temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arry={4,6,2,87,4,84,1,1,-56,3,0,25,-37};
        bblsrt(arry);
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
