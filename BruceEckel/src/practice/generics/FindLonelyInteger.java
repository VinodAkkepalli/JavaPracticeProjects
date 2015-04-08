package practice.generics;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class FindLonelyInteger {
	
	static int lonelyinteger(int[] a) {
		int a_size = a.length;
		Arrays.sort(a);
		int i=0;
		while(i+1 < a_size && a[i] == a[i+1]) {
			i+=2;
		}
		return a[i];

    }
	
	public static void main(String[] args) {
    /*    Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }*/
        
		int res = 0;
		int _a[] = {1,2,3,4,5,5,3,2,1};
		//int _a[] = {1};
		//int _a[] = {1,99,1};
		
        res = lonelyinteger(_a);

        System.out.println(res);
        
    }
}
