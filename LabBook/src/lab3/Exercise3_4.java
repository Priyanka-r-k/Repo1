package lab3;
import java.lang.*;
public class Exercise3_4 {
	
	static int modifyNumber(int num)
	{
		Integer intNum=num;
		String str=intNum.toString();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length()-1;i++)
		{
			int a=Math.abs((char)(str.charAt(i+1))-(char)(str.charAt(i)));
			sb.append(a);
		}
		sb.append((char)(str.charAt(str.length()-1)));
		return Integer.parseInt(sb.toString());
		
	}


	public static void main(String[] args) {
		int Number=45862;
		System.out.println(modifyNumber(Number));

	}

}
