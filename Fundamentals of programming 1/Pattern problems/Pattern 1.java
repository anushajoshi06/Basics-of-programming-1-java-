/*NUMBER PATTERN 1:  1
                     23
                     345
                     4567

*/


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		      Scanner s= new Scanner(System.in);
//int c=0;
		int n = s.nextInt();
 for(int i=1;i<=n;i++){
 for(int j=1;j<=i;j++){
	      // if(c!=n){
		     //  c++;
		       System.out.print(j+i-1);
            // c=c+1;
	       
	      // else
		      // break loop1;
       }
       System.out.print("\n");
       }
		
	}

}
