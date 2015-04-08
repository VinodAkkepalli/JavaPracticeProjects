package example.dp.singleton;

import java.util.Random;

public class RajnikanthTheGreat implements Runnable {

	private int count;
	private String name;
	private static RajnikanthTheGreat oneRajniOb;
	
	private RajnikanthTheGreat(String name){
		this.name = name;
		count = 0;
		//System.out.println("The one and only " + count);
	}
	
	public static synchronized RajnikanthTheGreat getInstance(String name){
		if(oneRajniOb == null){
			oneRajniOb = new RajnikanthTheGreat(name);
		}
		return oneRajniOb;
	}
	
	String getName(){
		return name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RajnikanthTheGreat.getInstance("Rajni" + new Random().nextInt(100));
	}
}
