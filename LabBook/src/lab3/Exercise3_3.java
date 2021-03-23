package lab3;

import java.util.StringTokenizer;


public class Exercise3_3 {
	static String alterString(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='z')
				sb.setCharAt(i,'a');
			else if(str.charAt(i)=='Z')
				sb.setCharAt(i,'A');
			else if(!(str.charAt(i)=='a' |str.charAt(i)=='e' |str.charAt(i)=='i' |str.charAt(i)=='o'| str.charAt(i)=='u'|
					str.charAt(i)=='A'|str.charAt(i)=='E' |str.charAt(i)=='I' |str.charAt(i)=='O'| str.charAt(i)=='U'))
			{
				char ch=(char)(str.charAt(i)+1);
				sb.setCharAt(i,ch);
			}
			
		}
		String nxtStr=sb.toString();
		return nxtStr;
	}

	public static void main(String[] args) {
		String str="JAVA";
		
		System.out.println(alterString(str));
		

	}

}
