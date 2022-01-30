public class Subarray_Minimum1 {

    public static void main(String args[]) {

        int n = 5;
        int[] arr = { 3, 1, 2, 4, 5 };

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                sum += min;
            }
        }

        System.out.println(sum);
    }
}
