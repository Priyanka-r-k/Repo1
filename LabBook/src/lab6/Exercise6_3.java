package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise6_3 {

	Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> sqrMap=new HashMap<Integer,Integer>();
		for(Integer integer:arr) {
			Integer sqrInteger=integer*integer;
			sqrMap.put(integer,sqrInteger);
		}
		return sqrMap;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,4,7,3,4,8,10};
		Map<Integer,Integer> sMap=new HashMap<Integer,Integer>();
		Exercise6_3 ex3=new Exercise6_3();
		sMap=ex3.getSquares(arr);
		
		System.out.println(sMap);
		
		
		}

		

}
