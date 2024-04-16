package thread;

import java.util.HashMap;
import java.util.Map;
public class MapSize
{

    public static void main(String[] args) 
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        int size = map.size();
        
        System.out.println("Size of the map: " + size);
    }
}


