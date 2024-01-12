public class searchinrotatedarray {
    public static int targetidx(int[] arry,int si,int ei,int target){
    if(si>ei){
        return -1;
    } 
    int mid=si+(ei-si)/2;
    if(arry[mid]==target){
        return mid;
    }
    
    //Case L1
    if(arry[mid]>=arry[si]){
        if(arry[si]<=target&&target<=arry[mid]){
            return targetidx(arry, si, mid-1, target);
        }else{
            return targetidx(arry, mid+1, ei, target);
        }
    //Case L2
    }else{
        if(arry[mid]<=target&&target<=arry[ei]){
            return targetidx(arry, mid+1, ei, target);
        }else{
            return targetidx(arry, si, mid-1, target);
        }
    }
   
    }
    
    public static void main(String[] args){
        int[] arry={4,5,6,7,0,1,2,3};
        System.out.println(targetidx(arry,0,arry.length-1,0));
    }
}
