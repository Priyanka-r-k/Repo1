package lab2;
import java.util.Scanner;

public class Exercise2_4 {
	static int removeDuplicate(int[] arr,int n)
	{ 
		        int[] temp = new int[n];  
		        int j = 0;  
		        for (int i=0; i<n-1; i++){  
		            if (arr[i] != arr[i+1]){
		            	temp[j++] = arr[i];
		                  } 
		            }  
		        temp[j++] = arr[n-1];     
		        for (int i=0; i<j; i++){  
		            arr[i] = temp[i];  
		        }  
		        return j;   
	}
	static void ModifyArray(int[] arr,int size)
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
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of elements of the arrays");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		 ModifyArray(arr,size);
		 size = removeDuplicate(arr,size); 
		
		 for(int i=0;i<size;i++) {
				System.out.print(arr[i] + " ");
			}
		}
}
