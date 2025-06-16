package collectionbasic;

import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;

public class ListEx {
	public static void main(String args[]) {
		//Create a List 
		//List<String> List=new ArrayList<String>(); (or)
		ArrayList<String> list=new ArrayList<String>();
		
		//HashSet<String> list=new HashSet<String>();
		
		//add elements
		list.add("FRONT-END LANGUAGE-->");
		list.add("c++");
		list.add("css");
		list.add("Bs");
		
		//Display the list of element
		System.out.println("Original list:"+list);
		
		//Adding the index
		list.add(3,"javaScript");
		System.out.println("After inseting:"+list);
		
		//updated the element 
		list.set(1,"html");
		System.out.println("After updating:"+list);
		
		//Remove by value 
		list.remove("Bs");
		System.out.println("After removing the Bs:"+list);
		
		//Check if list contains element
		System.out.println("html contained:"+list.contains("html"));
		
		//size of list
		System.out.println("Size:"+list.size());
	}

}
