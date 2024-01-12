public class quicksort {
    public static int partition(int[] arry,int start, int end){
        int pivot=arry[end];
        int i=start-1;
        for(int j=0;j<end;j++){
            while(arry[j]<=pivot){
                i++;
                int temp=arry[j];
                arry[j]=arry[i];
                arry[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arry[end]=arry[i];
        arry[i]=temp;
        return i;
    }
    public static void quicksort1(int[] arry,int start,int end){
        if(start>=end){
            return;
        }
        int pidx=partition(arry,start,end);
        quicksort1(arry, start, pidx-1);
        quicksort1(arry,pidx+1,end);
        
        


    }
    public static void main(String[] args){
        int[] arry={2,9,4,6,3,8};
        quicksort1(arry,0,arry.length-1);
    }
}
