/*NUMBER PATTERN:1
                 11
                 121
                 1221

*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
  int row = s.nextInt();
  
  if(row>=1)
  {
   for(int i =0; i<row;i++)
   {
    for(int j=0;j<=i;j++)
    {
     if(i==0)
     {
      System.out.print("1");
      
     }
     else if(j==0 || j==i)
     {
      System.out.print(1);
     }
     else
     {
      System.out.print("2");
      
     }
     
    }
    System.out.println();
    
   }
   
   
  }

	}