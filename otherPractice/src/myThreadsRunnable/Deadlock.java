package myThreadsRunnable;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Program to demonstrate a deadlock situation
 *	If/when both Batman & Joker say hi to each other at the same time, and waiting for the other to say hiBack
 *	Deadlock occurs here, because they don't say hi back
 */


public class Deadlock {

	public static void main(String[] args) {
		final Friend batman = new Friend("Batman");
		final Friend joker = new Friend("Joker");
		
		new Thread(new Runnable() {
			public void run() {
				batman.sayHi(joker);
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				joker.sayHi(batman);
			}
		}).start();
	}
}

class Friend {
	private final String name;

	public Friend(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public synchronized void sayHi(Friend bower) {
		System.out.format("%s: " + "Hi, How are you %s?\n", this.getName(), bower.getName());
		bower.hiBack(this);
		System.out.println(this.getName() + ": says we are good fiends!!");
	}

	public synchronized void hiBack(Friend bower) {
		System.out.format("%s: " + "Hi, I am good %s!!\n", this.getName(), bower.getName());
	}
}