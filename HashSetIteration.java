package thread;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetIteration 
{
	 public static void main(String[] args) 
	    {
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("star fruit");
	        hashSet.add("java fruit");
	        hashSet.add("Banana");
	        hashSet.add("Mango");
	        
	        Iterator<String> iterator = hashSet.iterator();
	        while (iterator.hasNext()) 
	        {
	            System.out.println(iterator.next());
	        }
	    }
}
