/*NUMBER PATTERN 2:       1
                         23
                        345
                       4567

*/




import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
          System.out.print(i+k-1);
        }
        System.out.println();
      }		
		
	}

}
