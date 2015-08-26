package practice.serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MySerializationConsumer {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {

		ObjectInputStream cFile = new ObjectInputStream(new FileInputStream(new File("serialized.ser")));
		
		try {
			
			MySerializationClass consumer = (MySerializationClass)cFile.readObject();
			System.out.println(consumer.getClass().getSimpleName());
			System.out.println(consumer.getmName());
			System.out.println(consumer.getmAddress());
			System.out.println(consumer.getmLength());
			
		} catch (Exception e) {
		System.out.println(e);
		}finally{
			cFile.close();
		}
		
		
	}

}
