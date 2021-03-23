package lab6;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Exercise6_4 {
	
	public Map<Integer,String> getStudents(Map<Integer,Integer> sMarks)
	{
		Map<Integer,String> sNew=new HashMap<Integer,String>();
		for(Map.Entry element :sMarks.entrySet()) {
			Integer marks=(Integer) element.getValue();
			if(marks>=90)
				sNew.put((Integer) element.getKey(), "GOLD");
			else if(marks>=80 && marks<90)
				sNew.put((Integer) element.getKey(), "SILVER");
			else if(marks>=70 && marks<80)
				sNew.put((Integer) element.getKey(), "BRONZE");
		}
		return sNew;
	}
	public static void main(String[] args) {
		Map<Integer,Integer> sMarks=new HashMap<Integer,Integer>();
		sMarks.put(101,70);
		sMarks.put(102,40);
		sMarks.put(103,89);
		sMarks.put(107,94);
		sMarks.put(105,57);
		
		Map<Integer,String> sMedal=new HashMap<Integer,String>();
		Exercise6_4 ex4=new Exercise6_4();
		sMedal=ex4.getStudents(sMarks);
		System.out.println(sMedal);
		
		}

	}

