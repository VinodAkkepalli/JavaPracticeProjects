package practice.serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerializationProducer {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, EOFException{
		
		MySerializationClass obj = new MySerializationClass("Vinod", "Bellampalli");
		
		ObjectOutputStream aFile = new ObjectOutputStream(new FileOutputStream(new File("serialized.ser")));
		
		aFile.writeObject(obj);
		aFile.close();
		
	}

}
