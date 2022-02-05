package practice;
import java.util.*;

public class Practice {

	public static void main(String[] args ) {
	String str = "aaaaahjklm";
	int max=0;
	Practice practice =new Practice();
	System.out.println("Here 1 ");
	max= practice.lengthOfChar(str);
	System.out.println("Value of max length is "+max);
		
	
}
	
	private int lengthOfChar(String str) {
		System.out.println("Here 2 ");
		int start ,end;
		start =end =0;
		int maxLength =0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		
		
		
		while(end<str.length()) {
			System.out.println("Here 3 ");
			if (map.containsKey(str.charAt(end))) {
				start = Math.max(start,map.get(str.charAt(end))+1);
				System.out.println("Here 4 "+map.get(str.charAt(end))+ " and Start is "+start);
			}
			map.put(str.charAt(end), end);
			
			
			
			if (maxLength<(end - start +1))
				maxLength = end - start +1;
			
			end ++;
		
		
		
		
	}
		return maxLength;
}
}
