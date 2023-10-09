public class duplicateelement {
    public static void prntdplct(int[] array){
        for(int i=0;i<array.length-1;i++){
            int num=array[i];
            for(int j=i+1;j<array.length;j++){
                if(num==array[j]){
                    System.out.println(array[j]+" occured again at index "+j);
                }
            }
           
        }
    }
    public static void main(String[] args){
        int[] array={5,6,2,7,1,9,4,5,7,2,5};
        prntdplct(array);
    }
}
