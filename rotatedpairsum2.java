public class rotatedpairsum2 {
    public static void pairsumrotated(int[] arry,int pivot,int target){
        int n=arry.length;
        int lp=pivot+1;
        int rp=pivot ;
        while(lp!=rp){
            int num1=arry[lp];
            int num2=arry[rp];
            if(num1+num2==target){
                System.out.println(num1+" "+num2);
                return;
            }else if(num1+num2>target){
                rp=(n+rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }
        System.out.println("No pair adds up to the target");
    }
    public static void main(String[] args){
        int[] arry={11,12,13,6,7,8,9,10};
        int pivot=2;
        int target=12;
        pairsumrotated(arry,pivot,target);
    }
    
}
