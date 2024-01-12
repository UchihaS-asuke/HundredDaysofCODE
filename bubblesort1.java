public class bubblesort1 {
    public static void printarry(int[] arry){
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
    public static int[] bubblesort(int[] arry){
        for(int i=0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                if(arry[j]<arry[i]){
                    int x=arry[j];
                    arry[j]=arry[i];
                    arry[i]=x;
                }
            }
        }
        return arry;
    }
    public static int[] selectionsort(int[] arry){
        for(int i=0;i<arry.length;i++){
            int smallest=i;
            for(int j=i+1;j<arry.length;j++){
                if(arry[j]<arry[smallest]){
                    smallest=j;
                }
            }
            int x=arry[i];
            arry[i]=arry[smallest];
            arry[smallest]=x;
        }
        return arry;
    }
    public static int[] insertionsort(int[] arry){
        for(int i=1;i<arry.length;i++){
            int curr=arry[i];
            int prev=i-1;
           
            while(prev>=0&&arry[prev]>=curr){
                arry[prev+1]=arry[prev];
                prev--;
            }
            arry[prev+1]=curr;
            
        }
        return arry;
    }
    public static void main(String[] args){
        int[] arry={ 4, 75, 1, 24 };
        insertionsort(arry);
        printarry(arry);

    }
}
