package interviews;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

    	Integer[] a = CountMethod("I love proGramming!!");
    	//Integer[] a = CountMethod("AazZ");
    	
    	for (int i = 0 ; i < 26; i++) {
    		System.out.print(a[i] + " ");
    	}
        	
    	
    	
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
