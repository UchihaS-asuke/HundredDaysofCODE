public class rotatedarrypairsum {
    public static void pairsumrotated(int[] arry,int pivot,int target){
        int lp=pivot+1;
        int rp=pivot;
        while(lp!=rp){
            int num1=arry[lp];
            int num2=arry[rp];
            if(num1+num2==target){
                System.out.println(num1+" "+num2);
                return;
            }
            if(num1+num2>target){
                if(rp==0){
                    rp=arry.length-1;
                }else{
                rp--;
                }
            }else{
                if(lp==arry.length-1){
                lp=0;
            }else{
                lp++;
            }
        }
    }
            System.out.println("No pair adds up to the target");
}
    public static int findpivot(int[] arry){
        for(int i=0;i<arry.length-1;i++){
            if(arry[i]>arry[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arry={11,12,13,14,15,6,7,8,9,10};
        int pivot=findpivot(arry);
        pairsumrotated(arry,pivot,30);
    }
}
