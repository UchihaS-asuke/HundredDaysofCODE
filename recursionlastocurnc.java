public class recursionlastocurnc {
    public static int lstocrnc(int[] arry,int key,int i){
        if(i==arry.length-1){
            return -1;
        }
        int idx=lstocrnc(arry, key, i+1);
        if(arry[i]==key&&idx==-1){
            return i;
        }
        return lstocrnc(arry,key,i+1);
        
    }
    public static void main(String[] args){
        int[] arry={3,5,2,6,7,3,4,7,2,8,0,1,9};
        System.out.println(lstocrnc(arry,3,0));
    }
}
