
import java.util.*;
import java.io.*;


public class Main
{
    private static void check(int n){
        System.out.println("Mid: "+n);
    }

    public static int floor(int[] arr, int low, int high, int target){
        if(low>=high){
            return -1;}
            
        int mid = low+(high-low)/2;
            
        if(arr[mid]==target ){
            return mid;
        }
        
        // if value is greater than target the it will go toward low_value
        if(arr[mid]>target ){
            return floor(arr, low, mid-1, target );
        }
        
        // for finding other value greater than current_value but nearest to target
        int val = floor(arr, mid+1, high,target);
        return val!=-1?val:mid;    
        
    }
    
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
		int target=sc.nextInt();
		int[] arr=new int[n];
    // Input Array
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }

		
		System.out.println( floor(arr,0,arr.length-1, target) );
	}
}
