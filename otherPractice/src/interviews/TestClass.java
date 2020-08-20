package interviews;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    
	public static void main(String args[] ) throws Exception {


		int x = 1;
		int y =1;
		int z = 1;
		int a= 1;
		boolean cond = (a == x && x == y &&  y == z);





    	String input = new String("scrum of scrums");
    	
    	int len = input.length();
    	Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
    	
    	for(int i = 0; i < len ; i++){
    		lhm.put(input.charAt(i), (lhm.get(input.charAt(i)) == null) ? 1 : (lhm.get(input.charAt(i))+1));
    	}

    	System.out.println(lhm.toString());
    	
    	for(Iterator<Character> it = lhm.keySet().iterator(); it.hasNext(); ){

    		if(lhm.get(it) == 1){
    			System.out.println(lhm.get(it));
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> entry : lhm.entrySet()){
    		if(entry.getValue() == 1){
    			System.out.println(entry.getKey());
    			break;
    		}
    	}
    }
    
    public static Integer[] CountMethod(String str){
    	
    	Integer[] a = new Integer[26];
    	
    	for (int i = 0 ; i < 26; i++) {
        	a[i] = 0;
    	}	
    	
    	char c;
    	int n = str.length();
    	for (int i = 0 ; i < n; i++) {
    		c = str.charAt(i);
    		if( c > 64 && c < 91 ){
    			a[c - 65]++;
    		}else if( c > 96 && c < 123){
    			a[c - 97 ]++;
    		}
    	}
    	return a;
    	
    }
    
}
