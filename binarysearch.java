public class binarysearch {
    public static int binsrch(int[] arry,int key){
        int start=0;
        int end=arry.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arry[mid]){
                return mid;
            }else if(key<arry[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void bblsrt(int[] arry){
        int l=arry.length;
         for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
            if(arry[j]>arry[j+1]){
                int temp=arry[j];
                arry[j]=arry[j+1];
                arry[j+1]=temp;
            }
         }
        }
    }
    public static void main(String[] args){
        int[] arry={3,46,65,12,76,3,8,8,4,23,12};
        bblsrt(arry);
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
        int key=23;
        int ans=binsrch(arry,key);
        if(ans==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index "+ans);
        }
    }
}
