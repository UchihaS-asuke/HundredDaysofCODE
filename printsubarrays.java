public class printsubarrays {
    public static void prntsbarry(int[] arry){
        int l=arry.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arry[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int[] arry={2,4,6,8,10};
        prntsbarry(arry);
    }
}
