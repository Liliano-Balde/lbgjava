package garage;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Car fordgt = new Car(" Car", "Land", "Ford GT500", 2005, true);
		Plane jet = new Plane(" Airplane", "Air", "Bombadier Global7500", 2015, true);
		Bike kawasaki = new Bike(" Motorbike", "Land", "Ninja H2 Carbon", 2022, true);

//		testing if the super implementation worked
		Vehicle vee = new Vehicle();
		vee.print();
		vee.setType("Car");
		vee.setMobility("Land");
		vee.setYear(2008);
		vee.setDetail("Chevy Corvette");
		vee.print();

//		testing creating a new car using super
		Car c = new Car("Car", "Land", "Chevy Camaro", 2012, true);

//created a new car, called the overriden method to also display the exhaust feature 
		Car p = new Car("Car", "Land", "BMW M3", 2018, true);

//		iterate over the array of Car objects i created and call the print method (override in cars class) for each car
		Car[] cars = { p, c };
		for (Car car : cars) {
			car.print();
		}

		c.print();

		fordgt.carMotto();
		jet.planeMotto();
		kawasaki.bikeMotto();

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Car", "Land", "Subaru Imprenza", 1999, true));
		vehicles.add(new Bike("Motorbike", "Land", "Harley-Davidson V-Rod 330", 2017, true));
		System.out.println(vehicles);

		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

		Privategarage myGarage = new Privategarage();

		myGarage.store(new Car("Car", "Land", "Koenigsegg Agera", 2020, true));
		myGarage.store(new Bike("Motorbike", "Land", "Superleggera V4", 2024, true));
		myGarage.remove(1);
		myGarage.print();
	}

}
