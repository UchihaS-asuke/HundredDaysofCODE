public class mergesort {
    public static void mergesort1(int[] arry,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort1(arry, si, mid);
        mergesort1(arry, mid+1, ei);
        merge(arry, si, ei, mid);
    }
    public static void merge(int[] arry,int si,int ei,int mid){
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arry[i]<arry[j]){
                temp[k]=arry[i];
                i++;
            }else{
                temp[k]=arry[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arry[i++];
        }
        while(j<=ei){
            temp[k++]=arry[j++];
        }
        for(i=si,j=0;i<=ei;i++,j++){
            arry[i]=temp[j];
        }
    }
    public static void prntarry(int[] arry){
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arry={8,3,6,4,1,5,2,7};
        mergesort1(arry,0,arry.length-1);
        prntarry(arry);
    }
}
