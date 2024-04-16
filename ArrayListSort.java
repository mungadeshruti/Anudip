package thread;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort 
{
	 public static void main(String[] args) 
	    {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(5);
	        arrayList.add(2);
	        arrayList.add(8);
	        arrayList.add(1);
	        arrayList.add(3);
	        
	        Collections.sort(arrayList);
	        
	        System.out.println("Sorted ArrayList: " + arrayList);
	    }
}
