import java.util.*;

public class Subarray_Minimum {

    public static void main(String args[]) {

        int n = 6;
        int[] arr = { 5, 3, 1, 2, 4, 6 };

        int sum = 0;
        int d = n - 1;

        while (d > 0) {

            for (int i = 0; i < n - d; i++) {

                int min = Integer.MAX_VALUE;

                System.out.print("[");

                for (int j = i; j <= i + d; j++) {

                    min = Math.min(min, arr[j]);

                    System.out.print(" " + arr[j] + " ");
                }

                System.out.print("]\tMin: " + min);
                System.out.println();
                sum += min;
            }

            sum += arr[d];

            d--;
        }
        sum += arr[0];

        System.out.println(sum);
        return;
    }

}

// Subarrays are [3], [1], [2], [4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4].

// Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.
