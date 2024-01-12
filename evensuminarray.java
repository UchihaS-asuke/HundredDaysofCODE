public class evensuminarray {
    public static int evensum(int[] arry){
        int sum=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]%2==0){
                sum+=arry[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arry={1,2,3,4,5,6,7,8,9};
        System.out.println(evensum(arry));
    }
}
