public class shiftingarryelem {
    public static void circularRightShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Ensure k is within the range of array length
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Right shift by 2 positions
        circularRightShift(arr, k);
        // Print the shifted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
