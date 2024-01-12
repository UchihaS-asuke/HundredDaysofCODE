public class binarysearch2 {
    public static void binsrch(int[] arry,int x){
        int l=arry.length;
        int start=0;
        int end=l;
        while(start<=end){
            int mid=(start+end)/2;
            if(arry[mid]==x){
                System.out.println(x+" found at index "+mid);
                break;
            }
            if(arry[mid]<x){
                start=mid+1;
            }
            if(arry[mid]>x){
                end=mid-1;
            }
        }
    }
    public static void main(String[] args){
        int[] arry={1,3,5,7,8,12,23,45,67,87,89};
        binsrch(arry,87);
    }
}
