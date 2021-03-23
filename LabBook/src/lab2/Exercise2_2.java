package lab2;
//import java.util.Arrays;
import java.util.Scanner;
public class Exercise2_2 {

	static String[] sortStrings(String arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println("Enter no of elements");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String Sarr[]=new String[n];
		Scanner scanner2=new Scanner(System.in);
		System.out.println("enter the string elements of the array");
		for(int i=0;i<n;i++)
		{
			Sarr[i]=scanner2.nextLine();
		}
		String[] sortedSarr = sortStrings(Sarr,n);
		scanner.close();
		scanner2.close();
		int x=0;
		if(n%2==0)
			x=n/2;
		else
			x=n/2+1;
		for(int i=0;i<x;i++)
		{
			System.out.print(sortedSarr[i].toUpperCase() +" ");
			
		}
		for(int i=x;i<n;i++)
		{
			System.out.print(sortedSarr[i].toLowerCase() +" ");
			
		}
		

	}

}
