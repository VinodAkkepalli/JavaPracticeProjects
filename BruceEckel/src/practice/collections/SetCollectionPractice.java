package practice.collections;

import java.util.*;

// HashSet, TreeSet & LinkedHashSet differences and set operations practice

public class SetCollectionPractice {

	public static void main(String[] args) {

		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		
		hs.add(23);
		hs.add(32);
		hs.add(86);
		hs.add(74);
		
		ts.add(543);
		ts.add(86);
		ts.add(9);
		ts.add(2);
		
		lhs.add(7);
		lhs.add(76);
		lhs.add(52);
		lhs.add(69);
		
		System.out.println("hs : " + hs);
		System.out.println("ts : " + ts);
		System.out.println("lhs : " + lhs);
		
		//To create a sorted set out of an unsorted set like HashSet
		Set<Integer> ts1 = new TreeSet<Integer>(hs);
		System.out.println("sorted order of hs is : " + ts1);
		
		hs.retainAll(ts);
		System.out.println("INTERSECTION of two sets hs & ts is : " + hs);
		
		System.out.println("hs is : " + hs);
		System.out.println("ts is : " + ts);
		
		ts.removeAll(hs);
		System.out.println("SET DIFFERENCE ts-hs is " + ts.toString());
		
	}

}
