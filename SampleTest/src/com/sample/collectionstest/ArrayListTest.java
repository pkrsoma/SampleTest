package com.sample.collectionstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	// create array list and some colors.
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("blue");
		al.add("green");
		System.out.println(al);
		// to iterate all elements
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// insert an element in array list at first position
		al.add(0, "black");
		System.out.println(al);
		// retrieve specified position
		System.out.println(al.get(3));
		al.set(1, "orange");
		System.out.println(al);
		// how to remove a element in array list
		al.remove(3);
		System.out.println(al);
		// how search an element in array list
		System.out.println(al.contains("black"));
		// how to sort array list
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		// copy an array list in another
		ArrayList al1 = new ArrayList(al);
		//al1.addAll(al), other option 
		System.out.println("New List "+al1);
		// to shuffle array list
		Collections.shuffle(al);
		System.out.println(al);
		// to reverse elements in array list
		Collections.reverse(al);
		System.out.println(al);
		// to extract portion in array list
		List sublist = al.subList(0,1);
		System.out.println("New sublist "+sublist);
		// how to compare two lists
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.equals(al1));
		// how to swap two elements in array list
		Collections.swap(al, 0, 1);
		System.out.println(al);
		// how to join 2 array list
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		al2.addAll(al1);
		System.out.println(al2);
		// how to clone an array list to another array list
		ArrayList al3 = (ArrayList)al2.clone(); 
		System.out.println(al3);
		// how to empty array list
		System.out.println(al3);
		al3.removeAll(al3);
		System.out.println(al3);
		// test list empty or not
		System.out.println(al3.isEmpty());
		// trim array list size to present array list size
		System.out.println(al2.size());
		al2.trimToSize();
		System.out.println(al2.size());
		// how to increase size of array list
		al2.add("purple");
		al2.add("yellow");
		System.out.println(al2.size());
		// how to replace second element in array list
		al2.set(1,"green");
		System.out.println(al2);
		// print all elements and its positions in array list
		for (int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
	}

}
