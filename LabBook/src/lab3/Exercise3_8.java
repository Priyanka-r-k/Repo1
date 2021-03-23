package lab3;

public class Exercise3_8 {
	static boolean posString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i+1)>s.charAt(i))
				continue;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str="Ant";
		if(posString(str))
			System.out.println("Positive String");
		else
			System.out.println("negative String");
	}

}
