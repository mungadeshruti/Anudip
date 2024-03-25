package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap; 
                  
public class MapDemo 
{

	public static void main(String[] args) 
	{
	HashMap set=new HashMap();
	set.add("shruti");
	
	HashMap<String, String> m=new HashMap();
	
	m.put(2, "shruti");
	m.put(10, "manisha");
	m.put(22, "shivani");
	m.put(4, "seema");
	m.put(7, "sakshi");
	m.isEmpty();
	m.remove("shruti");
	m.get(10);
	m.containsKey(22);
	m.size();
	m.values();

	}

}
