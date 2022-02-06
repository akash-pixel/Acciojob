import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

      System.out.println( numberOfSubarrays(arr, k) );
      
      return;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }
    
    public static int slidingWindow(int[] nums, int k){

       int count = 0, ans = 0;
            for (int begin = 0, end = 0; end < nums.length; end++) {
                // Checking odd or even
                if ((nums[end] & 1) == 1) {
                    count++;
                }
                while (count > k) {
                    if ((nums[begin++] & 1) == 1) {
                        count--;
                    }
                }
                ans += end - begin + 1;
            }
            return ans;
    }
}
