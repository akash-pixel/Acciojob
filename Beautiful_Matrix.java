
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        int x=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int val= sc.nextInt();
                if(val==1){x=i; y=j;}
            }
        }
        sc.close();
      
        int swaps = Math.abs(2-x)+Math.abs(2-y);
        System.out.print(swaps);

        return;
    }
}

/*
Input: 
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

Output: 
3
*/
