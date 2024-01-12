public class twopointerpairsum {
    public static void pointerpairsum(int[] arry,int target){
        int lp=0;
        int rp=arry.length-1;
        while(rp>lp){
            int num1=arry[lp];
            int num2=arry[rp];
            if(num1+num2==target){
                System.out.println(num1+" "+num2);
                return;
            }
            if(num1+num2>target){
                rp--;
            }
            if(num1+num2<target){
                lp++;
            }
        }
    }
    public static void main(String[] args){
        int[] arry={1,2,3,4,5};
        int target=5;
        pointerpairsum(arry,target);
    }
}
