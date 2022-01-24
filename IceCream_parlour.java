import java.util.*;

public class Main
{ 
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();

	    
		for( int t=0; t<tc; t++){
			int money = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = new int[n];

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			iceCream( arr, n, money);

		}

		return;
	}

	public static void iceCream(int[] arr, int n, int m){

		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){

				if( arr[i]+arr[j] == m){
					print(i,j);
					return;
				}
			}
		}

		print(-1,-1);
		return;
	}
  
  public static void print(int a, int b){
		System.out.println( (a+1) +" "+ (b+1));
		return;
	}
}

  
  

