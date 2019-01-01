/*
 * *Name: Sydney Baffour 
 * *Student ID: 2018843693
 */

/*
 * Do NOT import anything
 */

public class FillBoard
{
		public int solve(int n) {
		 if (n ==0 || n==1 ){
			 return 1;
		 }
		 else if( n==2){
			
			 return 5;
		 } 	
		else{
			return (solve(n-1)+5*(n-2));
		}
	}
}