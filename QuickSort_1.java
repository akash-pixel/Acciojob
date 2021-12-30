package acciojob;

import java.util.*;

/**
 * QuickSort_1
 */
public class QuickSort_1 {

    

    private static void printArr(int[] arr, int size) {
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void partition(int[] arr) {
        
        int pivot = arr[0];

        int index_l =0;
        int index_e =0;
        int index_r =0;

        int[] left = new int[arr.length];
        int[] equal = new int[arr.length];
        int[] right = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if ( pivot > arr[i] ) {
                left[index_l] = arr[i];
                index_l++;           
            }else if ( pivot == arr[i]) {
                equal[index_e] = arr[i];
                index_e++;
            }else if( pivot < arr[i] ){
                right[index_r] = arr[i];
                index_r++;
            }
        }//end for

        // Printing Arrays
        printArr(left, index_l );
        printArr(equal, index_e );
        printArr(right, index_r );

        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //printArr(arr, n);
        //System.out.println();

        partition(arr);


        return;
    }
    
}

