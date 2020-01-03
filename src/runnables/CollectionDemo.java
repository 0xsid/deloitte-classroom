package runnables;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CollectionDemo {
public static void main(String[] args){
	
	List items = new ArrayList();
	items.add("Manish");
	items.add(25);
	items.add(true);
	items.add(20.6);
	
	
	
  for(Object item:items) {
	  
	  System.out.println(item);
  }	
  
  items.remove((Object)25);  //Using value
  System.out.println("\n");
  System.out.println("After removing an element\n");
  items.add(2,"Rahul");
  items.remove((int)2);  //Using index
  items.add(false);
	items.add(60.2);
	System.out.println("\n");
for(Object item:items) {
	  
	  System.out.println(item);
  }
System.out.println("\n");
Iterator itr = items.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}


