public class backtrackingarrayupdate {
    public static void prntArry(int[] arry){
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
    public static void updtArry(int[] arry,int i,int val){
         if(i==arry.length){
            prntArry(arry);
            return;
         }
         arry[i]=val;
         updtArry(arry, i+1, val+1);
         arry[i]=arry[i]-2;
    }
    public static void main(String[] args){
        int[] arry=new int[5];
        updtArry(arry,0,1);
        prntArry(arry);
    }
}
