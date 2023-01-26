package com.sample.collectionstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Comparable> ll = new LinkedList();
		ll.add(10);
		ll.add("String");
		ll.add(32);
		ll.add(null);
		// how to append last element
		ll.add(4, "kumar");
		System.out.println(ll);
		// to iterate all elements
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		// iterate through all elements starting at specified position
		Iterator i = ll.listIterator(2);
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
		// try to iterate in reverse order
		Iterator ii = ll.descendingIterator();
		while (ii.hasNext())
		{
			System.out.println(ii.next());
		}
		// insert an element at specified position
		ll.add(3, "Akhil");
		System.out.println(ll);
		// insert at first and last position
		ll.addFirst("Sunny");
		ll.addLast("Si");
		System.out.println(ll);
		// insert some elements at specified position
		LinkedList a= new LinkedList();
		a.add(89);
		a.add(79);
		ll.addAll(3, a);
		System.out.println(ll);
		// to get first and last element in list
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		// display the positions of elements
		for (int k=0; k<ll.size();k++)
		{
			System.out.println((k+1)+" "+ll.get(k));
		}
		// remove specific element 
		ll.remove(2);
		System.out.println(ll);
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		// remove all elements in list
		System.out.println(a);
		//a.clear();
		System.out.println(a);
		// swap two elements in list
		System.out.println(ll);
		Collections.swap(ll, 2, 3);
		System.out.println(ll);
		// shuffle elements
		Collections.shuffle(ll);
		System.out.println(ll);
		// join two linked lists
		LinkedList ll1 = new LinkedList();
		ll1.addAll(ll);
		ll1.addAll(a);
		System.out.println(ll1);
		//clone list to another list
		LinkedList ll2 = (LinkedList)ll.clone();
		System.out.println(ll2);
		// remove and return the first element
		System.out.println(ll);
		System.out.println(ll.pop());
		// retrieve and dont remove first element
		System.out.println(ll.get(0));
		System.out.println(ll);
		// retrieve and dont remove last element
		System.out.println(ll.getLast());
		System.out.println(ll);
		// check element contains r not
		System.out.println(ll.contains(79));
		// convert linked to array list
		System.out.println(ll2);
		List l3 = new ArrayList(ll2);
		System.out.println(l3);
		System.out.println(l3.getClass());
		// compare 2 linked list
		System.out.println(ll.equals(ll1));
		// check list is empty r not
		System.out.println(ll.isEmpty());
		// replace an element
		System.out.println(ll);
		System.out.println(ll.set(1, "Pk"));
		System.out.println(ll);

	}
}
