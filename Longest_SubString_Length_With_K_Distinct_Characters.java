package practice;
import java.util.*;

public class Longest_SubString_Length_With_K_Distinct_Characters {
	
	public static void main(String[] args ) {
	
	String str = "bbbbbbbbbbbbb";
	//            012345678
	int k =2;
	int n = 0 ;
	Longest_SubString_Length_With_K_Distinct_Characters practice = new Longest_SubString_Length_With_K_Distinct_Characters();
	n = practice.findTheLength(str,k);
	
	System.out.println("Length is "+n);
		
	
}

	private int findTheLength(String s, int c) {
		String str =s;
		int k =c;
		int max =0;
		int start = 0;
		//bccbababd
		HashMap<Character,Integer> map =new HashMap<>();
		for(int end =0 ; end <str.length(); end++) {
			map.put(str.charAt(end),map.getOrDefault(str.charAt(end), 0)+1);
//			System.out.println("Value of End "+end+" Value of str "+ str.charAt(end)+" vslur of map "+map.get(str.charAt(end)));
			if(map.size()>k) {
				for (int i =start ; i<end ; i++) {
//					System.out.println("Value of i  & start"+i+" "+start+" Value of str "+ str.charAt(start)+" vslur of map "+map.get(str.charAt(start)));
					map.put(str.charAt(start),map.get(str.charAt(start))-1);
					if(map.get(str.charAt(start))==0) {
						map.remove(str.charAt(start));
						start++;
						break;
					}
					start++;
				}
			}
			max = Math.max(max, end -start+1);
			
		}
		
		
		
		return max;
	}
	
}
