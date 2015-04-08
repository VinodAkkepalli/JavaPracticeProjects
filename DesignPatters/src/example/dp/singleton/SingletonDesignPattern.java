package example.dp.singleton;

public class SingletonDesignPattern{

	public static void main(String[] args) {
		
		/* function calls to create a simple singleton class object without considering the synchronization part
		RajnikanthTheGreat rajni1 = RajnikanthTheGreat.getInstance("Unique");
		System.out.println(rajni1.getName());
		
		RajnikanthTheGreat rajni2 = RajnikanthTheGreat.getInstance("SecondOne");
		System.out.println(rajni2.getName());
		
		RajnikanthTheGreat rajni3 = RajnikanthTheGreat.getInstance("ThirdNow");
		System.out.println(rajni3.getName());
		*/

		
		Thread thread1 = new Thread(new RajnikanthTheGreat());
		thread1.start();


	}

}
