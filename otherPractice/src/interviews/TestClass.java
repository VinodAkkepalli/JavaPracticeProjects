package interviews;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    @SuppressWarnings("null")
	public static void main(String args[] ) throws Exception {
        
    	StringBuilder sb = new StringBuilder("abcdefghijkabcdefghijkabcdefghijkabcdefghijkabcdefghijkabcdefghijkabcdefghijkabcdefghijk");
    	
    	StringBuilder resultString = new StringBuilder();
    	int n = 10;
    	int len = sb.length();
    	while(n < len){
    		resultString.append(sb.charAt(n));
    		System.out.println(sb.charAt(n));
    		n+=10;
    	}
    	
    	System.out.println(resultString);
        System.out.println("Hello World!");
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
