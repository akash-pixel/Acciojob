import java.util.*;
import java.lang.*;

public class QuickSort_2 {

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+" " );
        }
    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i= high-1;

        for(int j=low; j<=high-1; j++){
            if(arr[j]< pivot){
                 i++;
                 Swap(arr, i,j);
            }
        }
        Swap(arr, i+1, high);

        return (i+1);
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            
           // printArr(arr);
            
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    } //end

    public static void main(String[] args) {
        int n=5; 
        int[] arr={5, 8, 1, 3, 7, 9, 2};

        QuickSort(arr, 0, n-1);
        return;
    }
}