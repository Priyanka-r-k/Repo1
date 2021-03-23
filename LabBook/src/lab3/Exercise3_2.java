package lab3;

import java.util.Scanner;

public class Exercise3_2 {
	
	public static String getImage(String s)
	{
		StringBuffer str1=new StringBuffer(s);
		str1=str1.reverse();
		String recString=s+"|"+str1;
		return recString;
	}

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter String ");
		String str=scanner.nextLine();
		String mirImage=getImage(str);
		System.out.println("Strings mirror Image ="+mirImage);
		
		
		
	}

}
