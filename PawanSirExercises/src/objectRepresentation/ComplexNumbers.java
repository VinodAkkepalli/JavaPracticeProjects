package objectRepresentation;

public class ComplexNumbers {

	public static void main(String[] args) {

		complex first, second, third;
		
		first = new complex();
		second = new complex();
		third = new complex();
		
		first.set(1, 2);
		first.myDouble();
		first.print();
		
		first.set(1, 2);
		first.ktimes(5);
		first.print();
		
		first.set(1, 2);
		float j = third.magsq();
		System.out.println(j);
		
		first.set(1,2);
		first.print();
		second.print2(first);	// in java static mem functions can also be accessed via instance variable
		complex.print2(first);
		
		second.set(2, 3);
		first.set(4, 2);
		second.add(first);
		second.print();
		
		second.set(2, 7);
		first.set(4, 2);
		third.add(second, first);
		third.print();
		
		second.set(2, 7);
		first.set(4, 2);
		third = second.add3(first);
		third.print();
		
		second.set(2, 7);
		first.set(4, 2);
		third = complex.add4(second, first);
		third.print();
		
	}

}
