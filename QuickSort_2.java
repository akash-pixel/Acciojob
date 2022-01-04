import java.util.*;
import java.lang.*;

public class QuickSort_2 {

    public static void printArr(ArrayList<Integer> list){
        for(int item : list){
            System.out.print(item+" ");
        }
        System.out.println();
        return;
    }
    
    // Main function
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[] arr = {5,8,1,3,7,9,2};
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++){
		    int num = sc.nextInt();
		    list.add(num);
		}
		
		
		list = Sort(list);
		//printArr(list);
	}
	
	// Devideing all the elements into arraylist
    public static ArrayList<Integer> Sort(ArrayList<Integer> list){
        if(list.size() <=1 ){ return list;}
        
        
            ArrayList<Integer> low = new ArrayList<>();
            ArrayList<Integer> high = new ArrayList<>();
            
            int m = list.get(0);
            list.remove(0);
            
            for(int i: list){
                if(i<m){
                    low.add(i);
                }else{
                    high.add(i);
                }
            }
            
            
            //if(low.size()>1){
                low = Sort(low );
            //}
            //if(high.size()>1 ){
                high = Sort(high);
            //}   
            
            return Merge(low, m, high);
            
            
    }
    
    // Merging all the array lists
    public static ArrayList<Integer> Merge(ArrayList<Integer> low, int m , ArrayList<Integer> high){
        low.add(m);
        for(int i: high){
            low.add(i);
        }
        printArr(low);
        return low;
    }
    
}
