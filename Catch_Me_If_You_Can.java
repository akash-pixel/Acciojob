
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
      int hidingSpot = sc.nextInt();
      int n = sc.nextInt();
      int thieves[] = new int[n];
      for(int i=0; i<n; i++){
        thieves[i] = sc.nextInt();
      }

      System.out.println( MaxThieveReachOut( thieves, n, hidingSpot ) );
    }

  public static int MaxThieveReachOut( int[] thieves,int n,int hidingSpot){

    Arrays.sort(thieves);
    
    int hidden = 0;
    int police = 0;

    for(int i=n-1; i>=0; i--){ 
      
      if( police >= thieves[i] ){
        break;
      }

      police = police + hidingSpot - thieves[i] ;
      hidden++;
    }
    return hidden;
  }
}
