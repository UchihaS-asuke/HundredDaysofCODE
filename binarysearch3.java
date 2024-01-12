public class binarysearch3 {
    public static void bblsrt(int[] arry){
        int l=arry.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arry[i]>arry[j]){
                    int temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }
        }
    }
    public static void binsrch(int[] arry,int key){
        int l=arry.length;
        int start=0;
        int end=l-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arry[mid]==key){
                System.out.println("Key found at index "+mid);
                break;
            }else if(arry[mid]>key){
                end=mid;
            }else{
                start=mid;
            }
        }
    }
    public static void main(String[] args){
        int[] arry={4,6,2,87,4,84,1,1,-56,3,0,25,-37};
        //WE NEED TO MAKE A NEW BUBBLE SORT FIRST
        bblsrt(arry);
        binsrch(arry, 0);
    }
}
