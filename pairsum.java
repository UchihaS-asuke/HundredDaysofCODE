public class pairsum {
    public static void pairsumfx(int[] arry,int target){
        for(int i=0;i<arry.length;i++){
            int num1=arry[i];
            for(int j=i+1;j<arry.length;j++){
                int num2=arry[j];
                if(num1+num2==target){
                    System.out.println(num1+" "+num2);
                    return;
                }
            }
        }
        System.out.println("No, two pairs sum up to target");
    }
    public static void main(String[] args){
        int[] arry={2,5,6};
        int target=5;
            pairsumfx(arry,target);
    }
}
