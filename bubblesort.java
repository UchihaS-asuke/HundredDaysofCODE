public class bubblesort {
    public static void bblsrt(int[] arry) {
        int l = arry.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arry = { 4, 75, 1, 24 };
        bblsrt(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
}
