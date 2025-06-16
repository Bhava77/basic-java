package collectionbasic;

import java.util.HashMap;

public class MapEx {
	public static void main(String args[]) {
		HashMap<Integer, String> countrycodes=new HashMap<Integer, String>();
		
		//adding elements
		countrycodes.put(1,"India");
		countrycodes.put(22,"japan");
		countrycodes.put(45,"USA");
		
		System.out.println(countrycodes);
		
		//updating
		countrycodes.put(14, "France");
		System.out.println(countrycodes);
		
		//Check if map contains
		System.out.println(countrycodes.containsKey(97));
		
		//display Key
		System.out.println(countrycodes.keySet());
		
		//Display all values
		System.out.println(countrycodes.values());
	}

}
