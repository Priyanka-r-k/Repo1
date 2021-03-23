package lab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise3_5 {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\Priyanka\\STS WORKSPACE\\java1\\a.txt");
		int nWords=0;
		int nLines=0;
		int nChar=f.available();
		for(int i=0;i<nChar;i++)
		{
			char ch=(char)f.read();
			if(ch=='\n')
				++nLines;
			else if(ch==' ')
				++nWords;
	}
		
		System.out.println("No of Characters = "+nChar);
		System.out.println("No of words = "+nWords);
		System.out.println("No of lines = "+(nLines+1));
	}

}
