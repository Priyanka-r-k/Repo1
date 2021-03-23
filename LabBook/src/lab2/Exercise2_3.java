package lab2;
//import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_3 {
	
	static String[] getSorted(int arr[])
	{
		String strArray[] = new String[arr.length];
		 for (int i = 0; i < arr.length; i++) {
	            strArray[i] = String.valueOf(arr[i]);
	            strArray[i]=reverseString(strArray[i]);
	            
		 }
		int n= strArray.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(strArray[i].compareTo(strArray[j])>0)
				{
					String temp=strArray[i];
					strArray[i]=strArray[j];
					strArray[j]=temp;
				}
				
			}
		}
		return strArray;
	}
	static String reverseString(String s)
	{
		StringBuilder string1 = new StringBuilder(s);
        string1.reverse();
        return string1.toString();
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		scanner.close();
	//	String [] StrArray=Arrays.toString(arr).split(",");;
		String[] sortedArr=getSorted(arr);
				for(int i=0;i<size;i++)
				{
					System.out.print(sortedArr[i] +" ");
					
				}

	}

}
