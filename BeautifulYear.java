
import java.util.*;
import java.io.*;

public class Main {
     
    public static boolean checkUnique(int year){
        
        int a = year%10; year/=10;
        int b = year%10; year/=10;
        int c = year%10; year/=10;
        int d = year%10;
        
        if(a==b||a==c||a==d||b==c||b==d||c==d ){
            return false;
        }
        
        
        return true;
    }
    
    
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean unique = false; 
        
        while(unique != true){
            year++;
            unique = checkUnique(year);
        }
        
        System.out.print(year);
    }
}