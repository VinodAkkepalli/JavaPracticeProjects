package myStringBuffer;

import java.io.DataInputStream;

public class myStringBufferClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer a; String b; int i;
		try{
			DataInputStream o=new DataInputStream(System.in);
			
			a=new StringBuffer("");
			b=o.readLine();
			a.append(b);
			
			System.out.println("The input string is: " + a);
			
			i=a.indexOf("x");
			System.out.println(i);
			
			System.out.println(a.indexOf("xy"));
			
			a.setCharAt(6, 'x');
			System.out.println(a);
			
			a.insert(4, "tty");
			System.out.println(a);
			
			a.append("ghij");
			System.out.println(a);
			
			a.reverse();
			System.out.println(a);
			
			a.delete(4, 7);
			System.out.println(a);
			
			a.deleteCharAt(5);
			System.out.println(a);
			
			a.replace(3, 7, "was");
			System.out.println(a);
			
			a.setLength(5);
			System.out.println(a);
			
			b=a.toString();
			System.out.println(b);
			
		}catch(Exception e){
			System.out.println("Error" + e);
		}

	}

}
