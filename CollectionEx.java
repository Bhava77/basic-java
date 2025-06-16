package collectionbasic;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
	public static void main(String args[]) {
         Collection<Object> obj1=new ArrayList<>();
         obj1.add("BhavaDharani");
         obj1.add('A');
         obj1.add(34567);
         obj1.add(3.2);
         obj1.add(true);
         
         //Display all element
         System.out.println(obj1);
         
         
         //Display mixed list
         System.out.println("\n Mixed Datatype in ArrayList");
         for(Object data : obj1 ) {
        	 System.out.println(data+ "(Type "+data.getClass().getName()+")");
         }
         
         //type specific logic using instance of 
         System.out.println("\n String only");
         for(Object data : obj1) {
        	 if(data instanceof String) {
        		 String num=(String)data;
        		 System.out.println("Character value:"+num);
        	 }
         }
}
}