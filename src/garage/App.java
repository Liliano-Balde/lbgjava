package garage;

public class App {

	public static void main(String[] args) {
		Car fordgt = new Car(" Car", "Land", "Ford GT500", 2005, true);
		Plane jet = new Plane(" Airplane", "Air", "Bombadier Global7500", 2015, true);
		Bike kawasaki = new Bike(" Motorbike", "Land", "Ninja H2 Carbon", 2022, true);

		fordgt.carMotto();
		jet.planeMotto();
		kawasaki.bikeMotto();

	}

}
