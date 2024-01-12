public class removerepeatednum {
    public static int[] trimzero(int[] arry){
        int count=0;
        for(int i=0;i<arry.length;i++){
        if(arry[i]!=0){
            count++;
        }else{
            break;
        }
        }
        int[] arry1=new int[count];
        for(int i=0;i<count;i++){
            arry1[i]=arry[i];
        }
        return arry1;
    }
    public static int[] removedupnum(int[] arry){
       int[] newarry=new int[arry.length];
       newarry[0]=arry[0];
       int count=1;
       for(int i=0;i<arry.length-1;i++){
        int curr=arry[i];
        int curr1=arry[i+1];
        if(curr!=curr1){
            newarry[count]=curr1;
            count++;
        }
       }
       for(int i=0;i<arry.length;i++){
        arry[i]=newarry[i];
       }
       
       return trimzero(arry);
    }
    public static void main(String[] args){
        int[] arry={1,1,1,1,2,2,2,2,2,2,3,3,3,3,4,4,4,4};
        int[] arry3=removedupnum(arry);
        for(int i=0;i<arry3.length;i++){
            System.out.print(arry3[i]+" ");
        }
    }
}
