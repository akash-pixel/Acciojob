import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        double miles = 0;
        n-=1;
        for(int i=0; i<arr.length ; i++){
            miles = miles + Math.pow(2,n)*arr[i];
            n--;
        }
        
        System.out.print((long)miles);
    }
}

//2147483647