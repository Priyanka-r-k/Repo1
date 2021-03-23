package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise6_1 {
	List getValues(HashMap<Integer,Integer> h)
	{
		List l=new ArrayList<>();
		for(Integer values : h.values())
		{
			l.add(values);
		}
		Collections.sort(l);
		return l;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm =new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 15);
		hm.put(3, 5);
		hm.put(5, 1);
		
		Exercise6_1 e =new Exercise6_1();
		List mysortedList =e.getValues(hm);
		
		System.out.println("sorted list"+ mysortedList);
		
		
		
		 
		

	}

}
