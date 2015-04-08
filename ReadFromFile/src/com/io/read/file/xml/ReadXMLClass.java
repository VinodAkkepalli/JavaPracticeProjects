package com.io.read.file.xml;

import java.io.File;
import java.io.Serializable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ReadXMLClass {

	/**
	 * @param args
	 */
	
	public void add(int a){
		loop: for(int i=1; i< 3; i++){
			for(int j= 1; j<3; j++){
				if (a==5){
					break loop;
				}
				System.out.println(i*j);
			}
		}
	}
	
	public static void main(String[] args) {

		ReadXMLClass a = new ReadXMLClass();
		a.add(5);
		
		try {
			
			File file = new File("resources\\Employee-Detail.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);


			//Create transformer
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			//  Output text type
			transformer.setOutputProperty(OutputKeys.METHOD, "text"); 

			Source source = new DOMSource(doc);
			Result result = new StreamResult(System.out);
			transformer.transform(source, result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
