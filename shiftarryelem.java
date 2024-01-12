public class shiftarryelem {
    public static void shiftarry(int[] arry, int n) {
        int l = arry.length;
        int[] arry2 = new int[l];
        for (int i = 0; i < l - n; i++) {
            arry2[n + i] = arry[i];
        }
        for (int i = 0; i < n; i++) {
            // arry2[i]= arry[i + n - 1];
            arry2[i] = arry[i + l - n];
        }
        for (int i = 0; i < l; i++) {
            System.out.print(arry2[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arry = { 1, 2, 3, 4, 5, 6, 7 };
        shiftarry(arry, 3);
    }
}
