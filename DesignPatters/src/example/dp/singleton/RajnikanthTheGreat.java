package example.dp.singleton;

/**
 * 
 * @author VinodAkkepalli
 *	
 *	Program to demonstrate that a singleton class creates only one object and
 *	returns the reference to same object if multiple attempts are made to create multiple objects	
 *
 *	This class is the Singleton class
 *	
 */

public class RajnikanthTheGreat{

	// object is made volatile to make sure that its state is visible to all thread
	private static volatile RajnikanthTheGreat oneRajniOb;
	String nameIs;	// to store name of the thread which created Rajnikanth
	
	private RajnikanthTheGreat(String name){
		this.nameIs = name;
	}
	
	public static RajnikanthTheGreat getInstance(String name){
		
		//Double Checked Locking for Singleton Creation to ensure thread safety
		//Observe that null checking if performed twice here
		if(oneRajniOb == null){
		
			synchronized(RajnikanthTheGreat.class){
				if(oneRajniOb == null){
					oneRajniOb = new RajnikanthTheGreat(name);
				}
			}
			
		}
		return oneRajniOb;
	}
	
}
