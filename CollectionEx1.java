package collectionbasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionEx1 {
	public static void main(String args[]) {
		Collection<String> str1=new ArrayList<>();
		
		str1.add("Bhava");
		str1.add("Dharani");
		str1.add("is to");
		str1.add("cute");
		 
		System.out.println("Original element:");
		for (String names : str1) {
			System.out.println(names);
		}
		
		ArrayList<String> sortedlist=new ArrayList<String>(str1);
		Collections.sort(sortedlist);
		System.out.println("Sorted colection:");
		for(String sortname : sortedlist) {
			System.out.println(sortname);
		}
		Collections.reverse(sortedlist);
		System.out.println("Reverse");
		for(String rev : sortedlist ) {
			System.out.println(rev);
		}
		String maxname=Collections.max(sortedlist);
		String minname=Collections.min(sortedlist);
		
		System.out.println("Maximum:"+maxname);
		System.out.println("Minimum:"+minname);
	}

}
