import java.util.*;

class Main
{
  	public static void main(String[] args)
  	{
     	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y= sc.nextInt();
		int xt = sc.nextInt();
		int yt = sc.nextInt();
		sc.close();

		int count = 0;
		String[] direction =new String[n];
		// Program
		while(true){
			int xd= x-xt;
			int yd = y-yt;
			
			if(xd==0 && yd==0){                // Print count
				System.out.println(count);
				for(int i=0;i<count; i++){
					System.out.print(direction[i]+" ");	
				}
				break;
			}else if((xd>0 && yd>0) || (xd==0 && yd>0)){   // Upper Left
				if(x-1<0 || y-2<0){
					System.out.print("Impossible");break;
				}
				x-=1;y-=2;
				direction[count] ="UL";
				count++;
			}else if(xd<0 && yd>0){       // Upper Right
				if(x+1>n-1 && y-2<0){
					System.out.print("Impossible");break;
				}
				x+=1;y-=2;
				direction[count] ="UR";
				count++;
			}else if(xd>0 && y==0){       //Left
				if(x-2<0){
					System.out.print("Impossible");break;
				}
				x-=2;
				direction[count] ="L";
				count++;
			}else if(xd<0 && yd==0){       //Right
				if(x+2>n+1){
					System.out.print("Impossible");break;
				}
				x+=2;
				direction[count] ="R";
				count++;
			}else if(xd>0 && yd<0){        // Lower Left
				if(x-1<0 && y+2>n-1){
					System.out.print("Impossible");break;
				}
				x-=1;y+=2;
				direction[count] ="LL";
				count++;
			}else if((xd<0 && yd<0) || (xd==0 && yd<0)){         // Lower Right
				if(x+1>n-1 && y+2>n-1){
					System.out.print("Impossible");break;
				}
				y+=2;x+=1;
				direction[count] ="LR";
				count++;
			}else{
				System.out.print("Impossible");break;
			}			
		}

		return;
  	}//end
}