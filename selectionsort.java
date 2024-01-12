public class selectionsort {
    public static int[] slcsrt(int[] arry) {
        int l = arry.length;
        for (int i = 0; i < l - 1; i++) {
            int index = i;
            
            for (int j = i + 1; j < l; j++) {
                if (arry[j]<arry[index]){
                    index=j;
                }
            }
            int temp = arry[index];
            arry[index] = arry[i];
            arry[i] = temp;
        }
        
        return arry;
    }

    public static void main(String[] args) {
        int[] arry = { 4, 3, 6, 1, 8, 9, 2, 7 };
        slcsrt(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
