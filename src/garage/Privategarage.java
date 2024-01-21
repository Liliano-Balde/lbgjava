package garage;

import java.util.ArrayList;

public class Privategarage {

//	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

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
		vehicles.add(vehicle);
	}

//	remove a vehicle
	public void remove(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void remove(int vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		System.out.println("Flexing Garage");
		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
		}
	}

	public void fix() {
		int fixBill = 0;
		for (Vehicle vehicle : vehicles) {
			fixBill += vehicle.calcBill();
			
		}
		System.out.println("To fix all vehicles you will have to pay " + fixBill);
	}

	@Override
	public String toString() {
		return "Privategarage [vechicles=" + vehicles + "]";
	}

}
