public class findmissingnum{
    public static int miss(int[] arry){
        int x=arry[0];
        for(int i=0;i<arry.length;i++){
            if(arry[i]!=x+i){
                return x+i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arry={1,2,4,4,5};
        System.out.println(miss(arry)+" is missing from the array");
    }
}