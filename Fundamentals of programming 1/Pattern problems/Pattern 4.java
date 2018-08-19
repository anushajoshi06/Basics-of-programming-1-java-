/*NUMBER PATTERN: 1
                 232
                34543


*/


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
 int i, space, rows, k=0;
        Scanner s = new Scanner(System.in);
      //  System.out.print("Enter Number of Rows : ");
        rows = s.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }
		
	}

}
