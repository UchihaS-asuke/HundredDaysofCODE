public class buynsellstock {
    public static void bsttym(int[] arry) {
        int l = arry.length;
        int lowestbuy = arry[0];
        int lb = 0;
        int hs = 0;
        int higestsel = arry[l - 1];
        int profit = higestsel - lowestbuy;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l - 1; i++) {
                if (lowestbuy > arry[i]) {
                    lowestbuy = arry[i];
                    lb = i;
                }
                if (higestsel < arry[i] && i > lb) {
                    higestsel = arry[i];
                    hs = i;
                }
                int tempprof = higestsel - lowestbuy;
                if (tempprof > profit) {
                    profit = tempprof;
                }
            }
        }
        System.out.println("Maximum profit can be made by buying at index " + lb + " and selling at index " + hs
                + "\nMaximum profit=" + profit);
    }

    public static void main(String[] args) {
        int[] arry = { 7, 1, 5, 3, 6, 4 };
        bsttym(arry);
    }
}
