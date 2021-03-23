package lab6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise6_7 {
	
	public ArrayList<Integer> getSorted(int[] arr)
	{
		ArrayList<Integer> arrlist =new ArrayList<Integer>();
		
		for(Integer elements:arr) {
			String str=elements.toString();
			StringBuilder sb=new StringBuilder();
			sb.append(str);
			sb=sb.reverse();
			arrlist.add(Integer.valueOf(sb.toString()));
			}
		System.out.println(arrlist);
		Collections.sort(arrlist);
		//int[] arr1=arrlist.toArray();
		return arrlist;
	}

	public static void main(String[] args) {
		Exercise6_7 ex7=new Exercise6_7();
		int[] arr= {12,54,23,9,90,34,1,56,28};
		ArrayList<Integer> arr1=ex7.getSorted(arr);
		System.out.println(arr1);
		
	}

}
