package lab6;

import java.util.ArrayList;
import java.util.Collections;



public class Exercise6_5 {

	public int getSecondSmallest(int[] arr)
	{
		int n=arr.length;
		
		ArrayList arrList=new ArrayList();
		for(int i=0;i<n;i++) {
			arrList.add(i, arr[i]);
		}
		Collections.sort(arrList);
		try {
		Integer sSmall= (Integer) arrList.get(1);
		return sSmall;}
		catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
	}
	public static void main(String[] args) {
	
		int[] arr= {3,7,8,90,24,12,4,2,1,90,5};
		Exercise6_5 ex5=new Exercise6_5();
		System.out.println("Secont smallest Integer of array is :"+ex5.getSecondSmallest(arr));
		
		
		
		
	}
}

