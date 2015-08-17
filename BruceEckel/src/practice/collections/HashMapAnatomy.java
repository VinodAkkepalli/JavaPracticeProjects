package practice.collections;

import java.util.HashMap;
import java.util.Map;

class Vehicle{
	private String name;
	private Integer rank;
	
	Vehicle(String name, Integer rank){
		this.name = name;
		this.rank = rank;
	}
	
	public int hashCode(){
		System.out.println("inside the hashcode method of: (" + this.name + ", " + this.rank +")");
		return rank;
	}
	
	public boolean equals(Vehicle obj){
		System.out.println("inside the equals method of: (" + this.name + " " + this.rank + ")");
		if((this.name == obj.name) && (this.rank == obj.rank)){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return "(" +this.name + "," + this.rank + ")";
	}
}

public class HashMapAnatomy {

	public static void main(String[] args) {

		Map<Vehicle, String> vMap = new HashMap<Vehicle, String>();
		
		//creating vehicle objects
		Vehicle ferrari = new Vehicle("Ferrari", 1);
		Vehicle porche = new Vehicle("Porche", 2);
		Vehicle mercedez = new Vehicle("Mercedez", 3);
		Vehicle hummer = new Vehicle("Hummer", 1);
		Vehicle audi = new Vehicle("Audi", 1);
		
		vMap.put(ferrari, "One");
		vMap.put(porche, "Two");
		vMap.put(mercedez, "Three");
		vMap.put(hummer, "One");
		vMap.put(audi, "One");
		vMap.put(porche,"four");
		vMap.put(hummer,"One");
		
		System.out.println("Hashmap entries are :");
		System.out.println(vMap.toString());
		
		vMap.get(audi);
	}

}
