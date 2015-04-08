package practice.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	//TODO practice addition, remove, define iterator next, hasNext, previous, hasPrevious

public class LinkedListPractice {

	public static void main(String[] args) {

		List<Integer> ll1 = new LinkedList<Integer>();
		
		ll1.add(1);
		ll1.add(2);
		
		System.out.println("Initial Linked list is : ");
		System.out.println(ll1.toString());
		
		
		System.out.println("After inserting at second position : ");
		ll1.add(1,11);
		//Print using LinkedList Iterator
		
		for(Iterator<Integer> it = ll1.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		System.out.println("printing the list in reverse order : ");
		//Print using LinkedList Iterator
		
		for(ListIterator<Integer> it = ll1.listIterator(ll1.size()); it.hasPrevious();){
			System.out.println(it.previous());
		}
		
		System.out.println("after sorting the list");
		Collections.sort(ll1);
		System.out.println(ll1.toString());
		
		List<Integer> ll2 = new LinkedList<Integer>(ll1);
		Collections.fill(ll2, 100);
		System.out.println("new list filled with 100");
		System.out.println(ll2);
		
		
		System.out.println("first list copied onto new list");
		Collections.copy(ll2,ll1);
		System.out.println(ll2);
		
		System.out.println("The position of element 2 in second list is");
		System.out.println(Collections.binarySearch(ll2, 2));;
	}

}
