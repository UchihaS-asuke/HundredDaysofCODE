public class lonelyelement {
    public static void lonely(int[] arry){
        boolean lone=false;
        for(int i=0;i<arry.length;i++){
            int num1=arry[i];
            for(int j=0;j<arry.length;j++){
                if(arry[j]!=num1+1||arry[j]!=num1-1){
                    lone=true;
                    break;
                }else{
                    lone=false;
                }
            }
            if(lone){
                System.out.print(num1+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] arry={3,4,5,7,10};
        lonely(arry);
    }
}
