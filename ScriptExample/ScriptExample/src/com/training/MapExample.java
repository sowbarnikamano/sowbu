package com.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
public static void main(String args[]){
	Map<Integer,String> map1=new HashMap<>();
	Map<Integer,String> map2=new HashMap<>();
	
	map1.put(1,"sow");
	map1.put(2,"mano");
	map1.put(3,"viji");
	map1.put(4,"suba");
	
	map2.put(1, "santhosh");
	map2.put(3,"sam");
	map2.put(5, "mano");
	map2.put(6,"suba");
	
	Set<Integer> samekeys=new TreeSet<>(map1.keySet());
	samekeys.retainAll(map2.keySet());
	for(Integer i : samekeys){
		System.out.println(i);
	}
	Set<String> samevalues=  new TreeSet<>(map1.values());
	samevalues.retainAll(map2.values());
	for(String str : samevalues){
		System.out.println(str);
	}
	
}
}
