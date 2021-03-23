package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.Period;

public class Exercise6_6 {

	public List<Integer> votersList(Map<Integer,LocalDate> map)
	{
		List<Integer> list =new ArrayList<Integer>();
		for(Map.Entry element :map.entrySet()) {
			Period period= Period.between((LocalDate) element.getValue(), LocalDate.now());
			//System.out.println(period.getYears());
			if(period.getYears()>18)
				list.add((Integer) element.getKey());
		}
		return list;
	}
	public static void main(String[] args) {
		Map<Integer,LocalDate> map=new HashMap<Integer,LocalDate>();
		map.put(1, LocalDate.of(1999, 8, 17));
		map.put(2, LocalDate.of(1957, 4, 1));
		map.put(4, LocalDate.of(2009, 3, 24));
		map.put(5, LocalDate.of(2017, 1, 7));
		
		List voterList=new ArrayList();
		Exercise6_6 ex6=new Exercise6_6();
		voterList=ex6.votersList(map);
		
		System.out.println(voterList);
		
		

	}

}
