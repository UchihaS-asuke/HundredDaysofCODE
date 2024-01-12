public class recursionfirstoccurence {
    public static int fstocrnc(int[] arry,int key,int strt){
        if(strt==arry.length-1){
            return -1;
        }
        if(arry[strt]==key){
            return strt;
        }else{
           return fstocrnc(arry,key,strt+1);
        }
    }
    public static void main(String[] args){
        int[] arry={3,5,2,6,7,3,4,7,2,8,0,1,9};
        System.out.println(fstocrnc(arry,4,0));
    }
}
