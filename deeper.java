
import java.util.Scanner;

/**
 * deeper
 */
public class deeper {

    public static int deep(int n, int[] arr, int count){
        if(n<=0){
            arr[count] = n;
            return count;
        }

        arr[count]=n;
        //count++;
        count = deep(n-5, arr, count+1);
        
        count++;
        arr[count]=n;
        
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int arr_len = (((n/5)+1)*2)+1;
       // System.out.println(arr_len);
        int[] arr= new int[ arr_len ];
        
        int count =0;
        count = deep(n, arr, count);


        for(int i=0; i<=count; i++){
            System.out.print( arr[i]+" " );
        }
        System.out.println();
        return;       
    }
    
}