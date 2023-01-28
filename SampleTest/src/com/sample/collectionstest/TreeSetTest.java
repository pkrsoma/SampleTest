package com.sample.collectionstest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// create a tree set and strings to it
		TreeSet ts = new TreeSet();
		ts.add("PKR");
		ts.add("SI");
		ts.add("Green");
		ts.add("Black");
		ts.add("Orange");
		System.out.println(ts);
		// iterate all elements 
		Iterator i = ts.iterator();
		for (int i1=0; i1<ts.size(); i1++) {
			System.out.println(i.next());
		}
		// add all elements to another tree set
		TreeSet ts1 = new TreeSet();
		ts1.addAll(ts);
		System.out.println(ts1);
		// reverse all elements in set
		Iterator i2 = ts.descendingIterator();
		while (i2.hasNext())
		System.out.println(i2.next());
		// get first and last element in set
		System.out.println(ts.first());
		System.out.println(ts.last());
		// clone to other tree set
		TreeSet ts2 = (TreeSet)ts.clone();
		System.out.println(ts2);
		// get number of elements in tree set
		System.out.println(ts.size());
		// compare 2 tree set
		System.out.println(ts.equals(ts1));
		// to find String less than SI in tree set
		TreeSet  ts3 = new TreeSet();
		ts3 = (TreeSet)ts.headSet("SI");
		System.out.println(ts3);
		// get the element with is greater than = given element
		System.out.println(ts.ceiling("SI"));
		// get the element with is strictly greater than = given element
		System.out.println(ts.higher("Black"));
		// get the element with is strictly greater than = given element
		System.out.println(ts.lower("Green"));
		// retrieve and remove first element 
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		// retrieve and remove last element
		System.out.println(ts.pollLast());
		System.out.println(ts);
		// remove given element
		ts.remove("Orange");
		System.out.println(ts);

		
		
	}

}
