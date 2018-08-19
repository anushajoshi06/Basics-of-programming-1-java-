import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
      char name=s.next().charAt(0);
      int as=(int)name;
      if (as>=65&&as<=91){ 
      System.out.print(1);
      }
      else if (as>=97&&as<=123){
      System.out.print(0);
      }
      else{
        System.out.print(-1);
        
      }
	}
}
