public class countingsort {
    public static int max(int[] arry){
        int big=arry[0];
        for(int i=1;i<arry.length;i++){
            if(big<arry[i]){
                big=arry[i];
            }
        }
        return big;
    }
    public static int min(int[] arry){
        int small=arry[0];
        for(int i=1;i<arry.length;i++){
            if(small>arry[i]){
                small=arry[i];
            }
        }
        return small;
    }
    public static void countsort(int[] arry){
        
        int maxi=max(arry);
        int[] newarry= new int[maxi+1];
        for(int i=0;i<arry.length;i++){
            newarry[arry[i]]+=1;
        }
        for(int i=0;i<=maxi;i++){
            int count=newarry[i];
            while(count>0){
                System.out.print(i+" ");
                count--;
            }
        }
    }
    public static void main(String[] args){
        int[] arry={7,3,4,7,1,2,8,5,2,9,4};
        countsort(arry);
    }
}
