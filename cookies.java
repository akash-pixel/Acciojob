import java.util.*;

class Cookies{
	public static void main(String[] args){
	
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=0; i<n; i++){
			int num = sc.nextInt();
			list.add(num);
		}
		
		Collections.sort(list);
		int count = 0;
		
		while( list.get(0)<k ){
			
			if(list.size()<=1){
                System.out.println(-1);
                return;
            }
			
			int num = list.get(0) + (2*list.get(1));
			
			list.remove(0);list.remove(0);
			list.add(num);
			
			count++;
			Collections.sort( list );
		}
		 
		 System.out.println(list);
		 System.out.println(count);
		
	}
}
