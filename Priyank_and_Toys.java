import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int i = 0;
        int container = 0;

        while( i< n){
            int limit = arr[i]+4;
            container++;
            
            int j;
            for( j=i; j<n; j++){
                if( arr[j]>limit ){
                    break;
                }
            }
            i = j;
        }
        
        System.out.println( container );
        
        return;
    }
}
