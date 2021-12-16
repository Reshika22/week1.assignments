package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CharacterOccMap {

	public static void main(String[] args) {
		
		String name = "PayPal India";
		char[] charArrayName = name.toCharArray();
		Map<Character, Integer> mapName = new LinkedHashMap<Character, Integer>();
		for (char singleChar : charArrayName) {
			
			if(mapName.containsKey(singleChar))
			{
				mapName.put(singleChar, mapName.get(singleChar)+1);
			}
			else
			{
				mapName.put(singleChar, 1);
			}
		}
		System.out.println(mapName.entrySet());
		
		//1 approach
		Set<Character> keySet = mapName.keySet();
		Integer result = Integer.MIN_VALUE;
		for (Character c : keySet) {
			if(mapName.get(c)>result)
			{
				result = mapName.get(c);
			}
			
		}
		
		System.out.println("Highest Repeated word : "+result);
		//2 approach
		List<Map.Entry<Character, Integer>> mapList = new ArrayList<Map.Entry<Character,Integer>>(mapName.entrySet());
		
		Collections.sort(mapList, new Comparator<Map.Entry<Character, Integer>>() {
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}});
		System.out.println("Second Highest Repeated Word : "+ mapList.get(mapList.size()-2));
	}

}
