public class selectionsort3 {
    public static void selectionsort(int[] arry,int l){
        int counter=0;

        for(int i=0;i<l;i++){
            int small=Integer.MAX_VALUE;
            for(int j=i;j<l;j++){
                if(arry[j]<small){
                    small=arry[j];
                    counter=j;
                }
            }
            int temp=arry[i];
            arry[i]=arry[counter];
            arry[counter]=temp;
        }
    }
    public static void main(String[] args){
       int[] arry={2,4,1,6,8,3,4,9,0,5};
       int l=arry.length;
       selectionsort(arry,l);
       for(int i=0;i<l;i++){
        System.out.print(arry[i]+" ");
       }
    }
}
