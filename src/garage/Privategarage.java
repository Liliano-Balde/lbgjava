package garage;

import java.util.ArrayList;

public class Privategarage {

//	private String name;
	private ArrayList<Vehicle> vechicles = new ArrayList<>();

////	public Privategarage(String name) {
////		super();
////		this.name = name;
//
//	}

//	public String getName() {
//		return name;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}

//	add a vehicle
	public void store(Vehicle vehicle) {
		vechicles.add(vehicle);
	}

//	remove a vehicle
	public void remove(Vehicle vehicle) {
		vechicles.remove(vehicle);
	}

	public void remove(int vehicle) {
		vechicles.remove(vehicle);
	}

	public void print() {
		System.out.println("Flexing Garage");
		for (Vehicle vehicle : vechicles) {
			vehicle.print();
		}
	}
}
