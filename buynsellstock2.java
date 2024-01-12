public class buynsellstock2 {
    public static void bsttime(int[] arry){
        int l=arry.length;
        int buytime=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<l;i++){
            int seltime=arry[i];
            if(buytime<seltime){
                int profit=seltime-buytime;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buytime=seltime;
            }
        }
        System.out.println("Maximum profit that can be made is "+maxprofit);
    }
    public static void main(String[] args){
        int[] arry={2,5,8,11,14,12,9,6,3,0};
        bsttime(arry);
    }
}
