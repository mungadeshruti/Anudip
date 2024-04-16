package thread;
import java.util.TreeSet;
public class TreeSetLessThanSeven 
{
	 public static void main(String[] args) 
	    {
		 TreeSet<Integer> treeSet = new TreeSet<>();
	        treeSet.add(5);
	        treeSet.add(2);
	        treeSet.add(8);
	        treeSet.add(1);
	        treeSet.add(3);
	        treeSet.add(3);
	        
	        TreeSet<Integer> result = (TreeSet<Integer>) treeSet.headSet(7);
	        
	        System.out.println("Numbers less than 7: " + result);
	    }
	}

	    