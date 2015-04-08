package practice.collections;

import java.util.*;
//TODO integers from 1 to 100, hash function is mod 3 and

public class HashMapPractice1 {

	public static void main(String[] args) {
		
		int modValue = 3;
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>(); 
		
//		for(int i=0; i<modValue;++i){
//			List<Integer>  = new List<Integer>();
//		}
		
		List<Integer> list0 = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		int n = 0;
		for(int i=0; i<100;++i){
			n = hashMod(i, modValue);
			
		}
	}

	static int hashMod(int number, int modValue){
		return number % modValue;
	}
}
