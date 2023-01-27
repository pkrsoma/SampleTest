package com.sample.collectionstest;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(789);
		hs.add(576);
		System.out.println(hs);
		// to append element at last
		hs.add(78);
		System.out.println(hs);
		// iterate all elements in set
		Iterator t = hs.iterator();
		for (int i = 0; i < hs.size(); i++) {
			System.out.println(t.next());
		}
		// to get number of elements
		System.out.println(hs.size());
		// to empty set
		// hs.clear();
		System.out.println(hs);
		// how to check set is empty or not
		System.out.println(hs.isEmpty());
		// to clone one hash set to another hash set
		HashSet<Integer> hs1 = (HashSet) hs.clone();
		System.out.println(hs1);
		// how to convert hash set to array
		Integer[] a = new Integer[hs1.size()];
		hs1.toArray(a);
		for (Integer a1 : a) {
			System.out.println(a1);
		}
		// convert hash set to tree set
		Set<Integer> ts = new TreeSet <Integer>(hs1);
		System.out.println(ts);
		// how to convert hash set to array list
		List <Integer> l1 = new ArrayList <Integer> (hs1);
		System.out.println(l1);
		// compare to hash sets
		System.out.println(hs.equals(hs1));
		// retain common elements in 2 sets
		hs1.add(24);
		hs1.add(7);
		System.out.println(hs1);
		hs.retainAll(hs1);
		System.out.println(hs);
		// remove all elements in hash set
		hs1.removeAll(hs1);
		System.out.println(hs1);
	}

}
