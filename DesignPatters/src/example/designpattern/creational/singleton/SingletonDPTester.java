package example.designpattern.creational.singleton;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Program to demonstrate that a singleton class creates only one object and
 *	returns the reference to same object if multiple attempts are made to create multiple objects	
 *
 *	This class is the tester class of singleton class RajnikanthTheGreat
 *	This program demonstrates that Rajnikanth is one and only and was/is created only once... lakalakalaka..
 *
 */

public class SingletonDPTester implements Runnable{

	public static void main(String[] args) {
		
		//to create multiple threads which try to create Rajnikanth all separately
		for(int i = 0; i < 10; i++){
			new Thread(new SingletonDPTester()).start();
		}
		
	}

	@Override
	public void run() {
		
		RajnikanthTheGreat rajniOb = RajnikanthTheGreat.getInstance(Thread.currentThread().getName());
		System.out.println("I am " + Thread.currentThread().getName() +
				". The Rajnikanth I created through: " + rajniOb.nameIs);

		SimpleSingletonRajni ssr = SimpleSingletonRajni.getInstance();
		System.out.println("I am " + Thread.currentThread().getName()+
				". The simple singleton I created is: " + ssr);
	}

}
