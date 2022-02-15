
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();
      int price[] = new int[n];

      for(int i=0; i<n; i++){
        price[i] = sc.nextInt();
      }

      System.out.println( flowerist( price,n, p ) );
    }

    public static int flowerist( int[] price, int len, int p ){

      int[] count = new int[p];
      int sum =0;
      
      Arrays.fill( count , 0);
      Arrays.sort(price);
      
      for(int i=len-1; i>=0; i--){
          
        sum += ++count[i%p] * price[i];
//         count[i%p]++;
      }
      return sum;
    }
}
