package com.sample.collectionstest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		// to append key and value in hash map 
		hm.put("Name", "PKR");
		hm.put("ID", "SI");
		System.out.println(hm);
		// to count the number of key-value size in mapping
		System.out.println(hm.size());
		// copy all to another map
		HashMap hm1 = new HashMap();
		hm1.putAll(hm);
		System.out.println(hm1);
		// remove all from map
		hm1.clear();
		System.out.println(hm1);
		// empty or not
		System.out.println(hm1.isEmpty());
		// to get copy of hash map instance
		HashMap hm2 = new HashMap();
		hm2 = (HashMap)hm.clone();
		System.out.println(hm2);
		// check if the specific key contains or not
		System.out.println(hm.containsKey("ID"));
		// check if the specific value contains or not
		System.out.println(hm.containsValue("SI"));
		// create set to hash map
		Set s = hm2.entrySet();
		System.out.println(s);
		// get the value of specified key
		System.out.println(hm.get("ID"));
		// get the set view of keys contained in map
		s=hm2.keySet();
		System.out.println(s);
		// get the collection view of values contained in map
		System.out.println(hm2.values());

	}

}
