
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int arr[] = { 1, 212, 12, 12 };
        int k = 1212;

        System.out.println(countPairs(4, k, arr));

    }

    public static long countPairs(int N, int X, int numbers[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        String target = String.valueOf(X);
        int n = target.length();

        for (int i = 0; i < N; i++) {
            map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
        }

        long count = 0;
        for (int x : map.keySet() ) {
            
            String s1 = String.valueOf(x);
            int n1 = s1.length();
            int cnt = map.get(x);
            int j = 0;
            
            while (j < n1 && j < n && s1.charAt(j) == target.charAt(j))
                j++;
            
            // 
            if (j == 0 || j != n1 || j == n)
                continue;

            String rem = target.substring(j);
            if (rem.charAt(0) == '0')
                continue;

            if (s1.equals(rem) == false)
                count += map.getOrDefault(Integer.parseInt(rem), 0) * cnt;
            else
                count += cnt * (cnt - 1);
        }
        return count;
    }

}
