
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println( distinctPairs( arr, n, k ) ); 
    }
    
    public static int distinctPairs(int[] arr, int n, int k){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if( (Math.abs(arr[i]-arr[j]) == k) && (map.get( arr[i] )== null) ){
                    count++;
                    map.put(arr[i],1);
                    break;
                }
            }
        }
        
        return count;
    }
}
