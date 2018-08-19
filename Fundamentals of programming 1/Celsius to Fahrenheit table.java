import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		
      Scanner s=new Scanner(System.in);
double celsius;
  int fahr=0;
  int lower, upper, step;

  lower = s.nextInt();
  upper = s.nextInt();
  step = s.nextInt();

 // printf("C     F\n\n");
  fahr= lower;
  while(fahr <= upper)
  {
    celsius=(5.0/9) * (fahr-32);
    System.out.println(fahr+"\t"+(int)celsius);
    fahr = fahr+ step;
}
  
		
	}

}
