package thread;
import java.util.LinkedList;
public class LinkedListOccurrences 
{
	 public static void main(String[] args) 
	    {
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(5);
	        linkedList.add(2);
	        linkedList.add(8);
	        linkedList.add(1);
	        linkedList.add(3);
	        linkedList.add(5);
	        
	        int firstIndex = linkedList.indexOf(5);
	        int lastIndex = linkedList.lastIndexOf(5);
	        
	        System.out.println("First occurrence of 5: " + firstIndex);
	        System.out.println("Last occurrence of 5: " + lastIndex);
	    }
	}


