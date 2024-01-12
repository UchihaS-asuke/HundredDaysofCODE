public class returnmajorityelem {
    public static int[] trimzero(int[] arry){
        int count=0;
        for(int i=0;i<arry.length;i++){
        if(arry[i]!=0){
            count++;
        }else{
            break;
        }
        }
        int[] arry1=new int[count];
        for(int i=0;i<count;i++){
            arry1[i]=arry[i];
        }
        return arry1;
    }
    public static int[] removedupnum(int[] arry){
       int[] newarry=new int[arry.length];
       newarry[0]=arry[0];
       int count=1;
       for(int i=0;i<arry.length-1;i++){
        int curr=arry[i];
        int curr1=arry[i+1];
        if(curr!=curr1){
            newarry[count]=curr1;
            count++;
        }
       }
       for(int i=0;i<arry.length;i++){
        arry[i]=newarry[i];
       }
       
       return trimzero(arry);
    }

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
    public static int mjrelm(int[] arry){
        mergesort1(arry, 0, arry.length);
        int[] arry1=removedupnum(arry);
        
    }
    public static void main(String[] args){
        int[] arry={2,2,2,2,3,3,4,4,4,5,5,5,6,7};
        
    }
}
