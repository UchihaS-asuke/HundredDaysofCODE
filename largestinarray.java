public class largestinarray {
    public static int large(int[] array){
        int big=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>big){
                big=array[i];
            }
        }
        return big;
    }
    public static void main(String[] args){
        int[] array={4,-2,6,-5,11};
        System.out.println(large(array));
    }
}
