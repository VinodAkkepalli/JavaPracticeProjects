/**
 * 
 */
package myString;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class myStringClass {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String a, b;
		try{
			System.out.println("Enter a string");
			DataInputStream o = new DataInputStream(System.in);
//			Reads a line of text from stream o
			a = o.readLine();
			b = a.substring(2,5);
			System.out.println(b);
			
//			Prints the location of first occurrence of 'x'
			System.out.println(a.indexOf('x'));
			
			String x = "Vinod";
			String y = " Kumar";
			String z = "";
			System.out.println(x + y);
			
//			prints each character of x in a separate line
			for(int i=1; x.length()!=0;i++){
				z = x.substring(0,1);
				x = x.substring(1);
				System.out.println(z);
			}
			
			String p = " spaces ";
//			trim() trims the leading and trailing spaces
			System.out.println(p.trim());
//			charAt(int) prints the character at a given position 
			System.out.println(p.charAt(3));
//			compares x & y; output 0 if equal +ve if x is lexicographically greater than y
			System.out.println("Vinod".compareTo(y));
			
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
