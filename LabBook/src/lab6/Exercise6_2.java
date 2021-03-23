package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise6_2 {

	public Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(Character character:arr) {
			Integer charCount=map.get(character);
			if(charCount==null)
				charCount=0;
			charCount++;
			map.put(character, charCount);
			
			
		}
		return map;
		
	}
		

		public static void main(String[] args) {
		char [] charArr= {'a','b','a','c','h','d','b','c','c'};
		Map<Character,Integer> cChar=new HashMap<Character,Integer>();
		Exercise6_2 ex=new Exercise6_2();
		
		cChar=ex.countChars(charArr);
		System.out.println(cChar);
		
		 

	}

}
