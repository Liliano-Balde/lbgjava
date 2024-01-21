package garage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Car fordgt = new Car(" Car", "Land", "Ford GT500", 2005, true);
		Plane jet = new Plane(" Airplane", "Air", "Bombadier Global7500", 2015, true);
		Bike kawasaki = new Bike(" Motorbike", "Land", "Ninja H2 Carbon", 2022, true);

//		testing if the super implementation worked
//		commented out due to the implementation of the tostring
//		commented the 14-21 out since im using abstrac now

//		Vehicle vee = new Vehicle();
//		vee.print();
//		vee.setType("Car");
//		vee.setMobility("Land");
//		vee.setYear(2008);
//		vee.setDetail("Chevy Corvette");
//		System.out.println(vee);
//		vee.print();

//		testing creating a new car using super
//		commented out due to the implementation of the to string
		Car c = new Car("Car", "Land", "Chevy Camaro", 2012, true);

//created a new car, plane and bike called the overriden method to also display the exhaust feature 
		Car p = new Car("Car", "Land", "BMW M3", 2018, true);

//		iterate over the array of Car objects i created and call the print method (override in cars class) for each car
		Car[] cars = { p, c };
		for (Car car : cars) {
			System.out.println(car);
//			car.print();
		}

//		c.print();
//		created vehicles and a respective text associated to each of them in this case a motto
		fordgt.carMotto();
		jet.planeMotto();
		kawasaki.bikeMotto();

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Car", "Land", "Subaru Imprenza", 1999, true));
		vehicles.add(new Bike("Motorbike", "Land", "Harley-Davidson V-Rod 330", 2017, true));

		System.out.println(vehicles);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
//			vehicle.print();
		}

		Privategarage myGarage = new Privategarage();

		myGarage.store(new Car("Car", "Land", "Koenigsegg Agera", 2020, true));
		myGarage.store(new Bike("Motorbike", "Land", "Superleggera V4", 2024, true));
//		myGarage.remove(1);
//		myGarage.print();

//		Object o = new Object();
//		creating new cars for comparison
		Car c1 = new Car("Car", "Land", "VW Golf", 2021, true);
		Car c2 = new Car("Car", "Land", "VW Golf", 2021, true);

		System.out.println("c == c2: " + (c1 == c2));
		System.out.println("c.equals(c2): " + c1.equals(c2));

		System.out.println("Jordan".equals("Jordan"));

		Bike d = new Bike("Motorbike", "Land", "Superleggera V4", 2024, true);
		Bike d2 = new Bike("Motorbike", "Land", "Superleggera V4", 2024, true);

		System.out.println("d == d2: " + (d == d2));
		System.out.println("d.equals(d2): " + (d.equals(d2)));

//		creating new list and sorting them 
		List<Vehicle> newVehicles = new ArrayList<>();

		Vehicle new1 = new Car("Car", "Land", "Bugatti Mistral", 2016, true);
		Vehicle new2 = new Car("Car", "Land", "Pagani Huayra Codalunga", 2024, true);
		Vehicle new3 = new Car("Car", "Land", "Ferrari F50", 1997, true);
		Vehicle new4 = new Plane("Plane", "Air", "Gulfstream G500", 2013, true);
		Vehicle new5 = new Bike("Motorbike", "Land", "Suzuki SV650", 2023, true);
		

//		testing sorting new vehicles only 
		Collections.sort(newVehicles);
		Collections.sort(vehicles);

		newVehicles.add(new2);
		newVehicles.add(new1);
		newVehicles.add(new3);
		newVehicles.add(new4);
		newVehicles.add(new5);
		System.out.println("VEHICLES: " + newVehicles);

//		testing after implementation of tostring
		System.out.println(myGarage);

		myGarage.fix();

	}

}
