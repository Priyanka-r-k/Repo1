package lab2;

import java.util.Scanner;

public class Exercise2_1 {

	static int getSecondSmallest(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[size-2];
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
		int x=getSecondSmallest(arr,size);
		System.out.println("Second Smallest Integer = " +x);

	}


}
