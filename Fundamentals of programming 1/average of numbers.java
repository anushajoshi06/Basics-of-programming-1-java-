import java.util.Scanner;
public class Solution {


public static void main(String[] args) {
Scanner s =new Scanner (System.in);
      char name=s.next().charAt(0);
	 
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
      
	int avg=(a+b+c)/3;
      
System.out.print(name+"\n"+avg);

		
	}

}
