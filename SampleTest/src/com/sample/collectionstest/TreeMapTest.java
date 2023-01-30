package com.sample.collectionstest;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		// add key and values
		tm.put("Name ", " PKR");
		tm.put("ID ", 786);
		tm.put("Number ", " 6787657");
		tm.put("Email ", " fhvivf@gmail.com");
		System.out.println(tm);
		// copy to another tree map
		TreeMap tm1 = new TreeMap();
		tm1.put("Last Name ", " SI");
		tm1.putAll(tm);
		System.out.println(tm1);
		// search a key in map
		System.out.println(tm1.containsKey("Name "));
		// search a value in map
		System.out.println(tm1.containsValue(" SI"));
		// get all keys in map
		System.out.println(tm.keySet());
		tm1.clear();
		System.out.println(tm1);
		// get key in map with greatest and least key
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		// get first lowest key and last highest key
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		// get the reverse order view of keys
		System.out.println(tm.descendingKeySet());
		// get the greatest key value less than or = given key
		System.out.println(tm.floorEntry("Name "));
		// get greatest key less than or = to given key
		System.out.println(tm.floorKey("ID"));
		// get the portion of a map whose keys are strictly less than a given key
		System.out.println(tm.headMap("Email "));
		System.out.println(tm.headMap("Number "));
		// get the portion of this map whose keys are less than (or equal to, if
		// inclusive is true) a given key
		System.out.println(tm.headMap("ID ", true));
		System.out.println(tm.headMap("Name ", true));
		System.out.println(tm.headMap("ID ", false));
		System.out.println(tm.headMap("Name ", false));
		// get the least key strictly greater than the given key. Return null if there
		// is no such key
		System.out.println(tm.higherEntry("ID "));
		System.out.println(tm.higherKey("Email "));
		// get a key-value mapping associated with the greatest key strictly less than
		// the given key. Return null if there is no such key.
		System.out.println(tm.lowerEntry("ID "));
		System.out.println(tm.lowerEntry("Name "));
		// get the greatest key strictly less than the given key. Return null if there
		// is no such key
		System.out.println(tm.lowerKey("Number "));
		System.out.println(tm.lowerKey("Name "));
		// get NavigableSet view of the keys contained in a map
		System.out.println(tm.navigableKeySet());
		// to remove and get a key-value mapping associated with the least key in a map.
		System.out.println(tm);
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm);
		// to remove and get a key-value mapping associated with the greatest key in
		// this map
		System.out.println(tm);
		System.out.println(tm.pollLastEntry());
		System.out.println(tm);
		// get the portion of a map whose keys range from a given key (inclusive), to
		// another key (exclusive).
		SortedMap sm = new TreeMap();
		tm.put("Car ", " BMW");
		tm.put("Rent ", " 890");
		sm = tm.subMap("Car ", "Name ");
		System.out.println(tm);
		System.out.println(sm);
		// get the portion of a map whose keys range from a given key to another key
		sm = tm.subMap("Car ", true, "Name ", true);
		System.out.println(sm);
		sm = tm.subMap("ID ", false, "Rent ", false);
		System.out.println(sm);
		// get a portion of a map whose keys are greater than or equal to a given key.
		System.out.println(tm.tailMap("Name "));
		// get a portion of a map whose keys are greater than to a given key
		System.out.println(tm.tailMap("Name ", false));
		System.out.println(tm.tailMap("Name ", true));
		// get a key-value mapping associated with the least key greater than or equal
		// to the given key. Return null if there is no such key
		System.out.println(tm.ceilingEntry("Rent "));
		// get the least key greater than or equal to the given key. Returns null if
		// there is no such key
		System.out.println(tm.ceilingKey("Car "));
		System.out.println(tm);

	}

}


/*
 * class Sort implements Comparator {
 * 
 * public int compare(String str1, String str2) { return str1.compareTo(str2 );
 * } }
 */
 