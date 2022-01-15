import java.util.*;

public class coinGame{

	public static void main(String[] args){
	
		int n = 6;
		
		boolean ans = coin(n);
		
		if( ans == true ){
			System.out.println("Alice");
		}
		else{
			System.out.println("Bob");
		}
		
		return;
	}
	
	public static boolean coin( int n ){
	
		boolean[] dp = new boolean[n+1] ;
		
		Arrays.fill( dp, false );
		
		dp[0] = false;
		dp[1] = true;
		
		for(int i=2; i<=n; i++){
			
			if( i-1>=0 && dp[i-1]==false ){
				dp[i] = true;
			}
			else if( i-2>=0 && dp[i-2]==false ){
				dp[i] = true;
			}
			else if( i-4>=0 && dp[i-4]==false ){
				dp[i] = true;
			}
			else{
				dp[i] = false;
			}
		}
		
		return dp[n];
	}

}
