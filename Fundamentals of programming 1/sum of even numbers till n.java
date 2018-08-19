import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum = 0;
    for(int i = 1; i <=n; i++)
    {
        if(i%2 == 0)
        {
           // System.out.println("Summan blir : " + i);
            sum = sum + i;

    }
    }
        System.out.println(sum);     
		
	}

}
