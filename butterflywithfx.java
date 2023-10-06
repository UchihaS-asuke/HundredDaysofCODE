public class butterflywithfx {
    public static void btrfly(int x) {
        for (int i = 1; i <=2*x; i++) {
            if (i <= x) {
                for (int j = 1; j <= 2 * x; j++) {
                    if (j > i && j <= 2 * x - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 2 * x; j++) {
                    if (j < i && j > 2 * x - i + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        int x = 5;
        btrfly(x);
    }
}
