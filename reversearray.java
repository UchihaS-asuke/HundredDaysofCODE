public class reversearray {
    public static void revsarry(int[] arry){
        int l=arry.length;
        for(int i=0;i<=l/2;i++){
            int temp=arry[i];
            arry[i]=arry[l-i-1];
            arry[l-1-i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arry={5,6,3,2,7,4,9,8};
        revsarry(arry);
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
