import java.util.*;

public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n;i++){
		    arr[i] = sc.nextInt();
		}
    sc.close();
		
		// Sorting Array
		Arrays.sort(arr);
		int min= arr[n-1];
		ArrayList<Integer> pairs = new ArrayList<>();
		
		for(int i=0; i<n-1; i++){
		    for(int j=i+1; j<n; j++){
          
		        if(arr[j]-arr[i] < min ){
		            pairs.clear();
		            min = arr[j]-arr[i];
		            pairs.add(arr[i]);
		            pairs.add(arr[j]);
		        }else if(arr[j]-arr[i] == min ){
		            pairs.add(arr[i]);
		            pairs.add(arr[j]);
		        }
		    }
		}
		
    // Print pairs
		for(int i=0; i<pairs.size(); i++ ){
		 System.out.print(pairs.get(i)+" " );   
		}
		
	}// end function
}
/*
Input:
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 

Output:
*/
