package practice;

import java.util.*;

public class Longest_SubString_Length_With_No_Repeating_Characters {

	public static void main(String[] args) {

		String str = "babccbacd";
				   // 012345678
		int n = 0;
		Longest_SubString_Length_With_No_Repeating_Characters practice = new Longest_SubString_Length_With_No_Repeating_Characters();
		n = practice.findLength(str);	
		
		System.out.println("Value of n "+n);
		
	}

	private int findLength(String str) {
		int start , end ;
		start = end =0;
		int max =0;
		
		Map<Character, Integer> map = new HashMap<>();
		for(end=0 ; end<str.length() ; end ++) {
			if(map.containsKey(str.charAt(end)))
				start = Math.max(start, map.get(str.charAt(end))+1);
			map.put(str.charAt(end), end);
			
			max = Math.max(max,end-start+1);
		}
		
		return max;
	}

}
