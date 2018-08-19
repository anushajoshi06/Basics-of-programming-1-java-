/*NUMBER PATTERN:1234
                 123
                 12
                 1

*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
  Scanner s = new Scanner(System.in);
         
        //Taking rows value from the user
         
       // System.out.println("How many rows you want in this pattern?");
         
        int rows = s.nextInt();
         
       // System.out.println("Here is your pattern....!!!");
         
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
	}
}
