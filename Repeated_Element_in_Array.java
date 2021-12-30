import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int[] repeated = new int[n/2];
        int repeatIndex = 0;
        
        for(int i=0; i<n-1; i++){
            
                if(arr[i]==arr[i+1] ){
                    
                    boolean inRepeated =false;
                    for(int x=0; x<repeatIndex; x++){
                        if(repeated[x]== arr[i] ){ inRepeated=true; }
                    }
                    if(inRepeated==false){
                        repeated[repeatIndex]=arr[i]; 
                        repeatIndex++;
                    }
                }else{continue;}
            
        }
        
        // print repeated values
        if(repeatIndex!=0){
            for(int i=0; i<repeatIndex;i++ ){
                System.out.print(repeated[i]+" " );
            }
        }else{
            System.out.print(-1);
        }    
        
        
        return;
    }// end function
}

/*
Input:
9
3 4 5 7 8 1 2 1 3

Output:
1 3
*/
