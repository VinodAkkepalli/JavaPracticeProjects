package com.io.read.file.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream ("resources\\data.properties"));
			String name = prop.getProperty("name");
			String address = prop.getProperty("address");
			
			System.out.println("Name : " + name);
			System.out.println("Address : " + address);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
