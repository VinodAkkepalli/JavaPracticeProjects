package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnippetsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float x =0;
		int y=9;
		
		try {
			System.out.println(y / x);
		} catch (Exception e) {
			System.out.println("divide by zero Exception");
		}
	
	}

}