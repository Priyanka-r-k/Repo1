package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise3_1 {

	public static void main(String[] args) {
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter string of integers with space between them ");
		  String digit=scanner.nextLine();
      	  StringTokenizer token=new StringTokenizer(digit);
          int dig=0,sum=0;
          System.out.println("Entered digits are : ");
          while(token.hasMoreTokens())
          {
          String s=token.nextToken();
          dig=Integer.parseInt(s);
          System.out.print(dig+" ");
              sum=sum+dig;
  }
          System.out.println();
          System.out.println("Sum is : "+sum);
	}

}
